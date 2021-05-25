package beggining.Arrays;

import java.util.Deque; // импортируем Deque так как у Queue нет методов для работы с концом коллекции

public class Boss {
    private Deque toDoDeque;
    public Boss(Deque toDoDeque) {
        this.toDoDeque = toDoDeque;
    }
    public void giveTask(String task) {
        toDoDeque.add(task); // метод добавления не меняется
        System.out.println("Дал задачу " + task);
    }
}