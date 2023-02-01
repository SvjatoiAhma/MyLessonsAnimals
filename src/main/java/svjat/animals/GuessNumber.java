package svjat.animals;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int a = 1; // Начальное значение диапазона - "от"
        int b = 50; // Конечное значение диапазона - "до"

        System.out.println("Привет, давай поиграем? Я загадал число от 1 до 50!\nУгадай какое ))) У тебя 3 попытки!");

        int random_num = a + (int) (Math.random() * b); // Генерация числа
        System.out.println("Я загадал число: " + random_num);

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > random_num) {
            System.out.println("Твое число больше загаданного! Осталось 2 попытки.");
            } else if (number < random_num){
                System.out.println("Твое число меньше загаданного! Осталось 2 попытки.");
            } if (number == random_num){
                System.out.println("Ты победил! Поздравляю!");
            }

            scanner = new Scanner(System.in);
            number = scanner.nextInt();
        if (number > random_num) {
            System.out.println("Твое число больше загаданного! Осталась 1 попытка.");
        } else if (number < random_num) {
                System.out.println("Твое число меньше загаданного! Осталась 1 попытка.");
            } if (number == random_num) {
                System.out.println("Ты победил! Поздравляю!");
            }
        scanner = new Scanner(System.in);
        number = scanner.nextInt();

        if (number == random_num) {
                System.out.println("Ты победил! Поздравляю!");
            } else {
                System.out.println("Ты проиграл!");
            }
        }
    }
