package beggining.Arrays;

import java.util.Deque;
import java.util.Queue;

public class Worker {
    private Deque toDoDeque; // у рабочего есть ссылка на очередь из заданий
    public Worker(Deque toDoDeque) {
        this.toDoDeque = toDoDeque; // даем ссылку на очередь в конструкторе
    }
    public void takeTask() {
        Object task = toDoDeque.pollLast(); // вынимаем задание из очереди
        if (task != null) {
            System.out.println("Выполняю задачу: " + task);
        } else {
            System.out.println("Нет работы! Можно идти домой");
        }
    }
}