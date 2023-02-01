package svjat.animals;

import java.util.Scanner;

public class if_Else_If_Demo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10");
        int number = scanner.nextInt();
        if(number < 0 && number > 10){
            System.out.println("Положительное число больше 10");
        }else {
            System.out.println("Число не соответствует условию");
        }

    }
}
