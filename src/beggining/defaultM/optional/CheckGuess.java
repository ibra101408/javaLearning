package beggining.defaultM.optional;

import java.util.Optional;
import java.util.Random;

public class CheckGuess {

    private static Optional<String> checkGuess(int guess) {
        if (guess < 1 || guess > 5) {
            throw new IllegalStateException(); // проверяем на граничные условия
        } else {
            int result = new Random().nextInt(5) + 1; // генерируем рандом
            System.out.println(result);
            if (result == guess) { // делаем проверку
                return Optional.of("Поздравляем! Вы угадали значение!");
            }   else {
                return Optional.empty();
            }
        }
    }
        public static void main(String[] args) {
            System.out.println(checkGuess(1));

    }
    }
