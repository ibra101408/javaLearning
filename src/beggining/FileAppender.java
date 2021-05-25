package beggining;
import java.io.*;
public class FileAppender {
    private final File file; // Файл для добавления будет неизменяемый
    private static final boolean APPEND = true; // Далее две константы чтобы в коде
    private static final boolean NOT_APPEND = false; // было ясно что это за булева значения
    public FileAppender(File file) { // Файл для добавления передаём через стандартный конструктор
        this.file = file; // инициализируем поле класса
        if (!file.canRead() || !file.canWrite()) { // Проверяем что файл можно читать и редактировать
            String msg = "File cant read or written."; // дополнительное пояснение к исключению
            throw new IllegalArgumentException(msg); // выбрасывается исключение
        }
    }
    public void addToBegin(String text) throws IOException {
        File temp = File.createTempFile("prerenderPrefix", ".txt"); // Временный файл для копирования
        this.copyFile(file, temp); // копируем оригинальный файл во временный
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, NOT_APPEND)); // запись в оригинал
             BufferedReader reader = new BufferedReader(new FileReader(temp))) { // чтение из копии
            writer.write(text); // поток имеет флаг NOT_APPEND, добавление строки перезапишет файл
            while (reader.ready()) { // читаем строки из временного файла
                writer.write(reader.readLine()); // пишем построчно в файл из временного файла
                writer.newLine(); // нужен перенос
            }
            writer.flush(); // выгружаем содержимое буфера в файл
        }
    }
    public void addToEnd(String text) throws IOException {
        try (FileWriter writer = new FileWriter(file, APPEND); // поток для записи в файл
             BufferedWriter bufferWriter = new BufferedWriter(writer)) { // оборачиваем в буферизованный поток
            bufferWriter.write(text); // поток имеет флаг APPEND, строка добавится в конец
            bufferWriter.flush(); // выгружаем содержимое буфера в файл
        }
    }
    public void printFile() throws IOException {
        try (FileReader reader = new FileReader(file); // поток для чтения файла
             BufferedReader bufferedReader = new BufferedReader(reader)) { // оборачиваем в буферизованный поток
            while (bufferedReader.ready()) { // читаем файл
                System.out.println(bufferedReader.readLine()); // печатаем построчно
            }
        }
    }
    private void copyFile(File original, File copied) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(copied, NOT_APPEND)); // запись в копию
             BufferedReader reader = new BufferedReader(new FileReader(original))) { //чтение из оригинального файла
            while (reader.ready()) { // читаем оригинал
                writer.write(reader.readLine()); // пишем в копию
                writer.newLine(); // нужен перенос
            }
            writer.flush(); // выгружаем содержимое буфера в файл
        }
    }
    public static void main(String[] args) throws IOException {
        String firstLine = "Hello world!" + System.lineSeparator(); // разные строки для примера
        String lastLine = "An example of io operations on a file." + System.lineSeparator();
        File example = File.createTempFile("example", ".txt"); // временный файл для программы
        FileAppender appender = new FileAppender(example); // временный файл передаём через конструктор
        appender.addToEnd(lastLine); // проверяем что не важна последовательность вызовов
        appender.addToBegin(firstLine); // чередуем запись в начало и конец файла
        appender.addToEnd(lastLine);
        appender.addToBegin(firstLine);
        appender.printFile(); // печатаем результат
    }
}