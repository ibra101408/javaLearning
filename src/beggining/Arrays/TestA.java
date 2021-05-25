package beggining.Arrays;

import java.util.Map;
import java.util.TreeMap;

public class TestA {
    public static void main(String[] args) {
        Map<Integer, String> winners = new TreeMap<>(); // ваш код тут

        winners.put(3, "Вася");
        winners.put(1, "Федя");
        winners.put(2, "Антон");

        printWinners(winners);
    }

    private static void printWinners(Map<Integer, String> winners) {
        for (Map.Entry<Integer, String> entry : winners.entrySet()) {
            System.out.println(entry.getKey() + " место занял " + entry.getValue());
        }
    }
}
