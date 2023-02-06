package svjat.animals;

public class if_Else_If_Demo {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10");
        int number = scanner.nextInt();
        if(number > 0 && number <= 10){
            System.out.println("Это положительное число больше 0");
        }else {
            System.out.println("Число не соответствует условию");
        }

        System.out.println("Введите число соответствующее дню недели");
        Scanner scanner2 = new Scanner(System.in);
        int number2 = scanner.nextInt();
        if(number2 ==1) {
           System.out.println("Понедельник");
        } else if(number2 == 2) {
            System.out.println("Вторник");
        } else if(number2 == 3) {
            System.out.println("Среда");
        } else if(number2 == 4) {
            System.out.println("Четверг");
        } else if(number2 == 5) {
            System.out.println("Пятница");
        } else if(number2 == 6 || number2 == 7) {
            System.out.println("Выходной");
        } else {
            System.out.println("Число не соответствует условию");
        }
*/
        int a = 1;
            a = 2;
        int count = 1;
        while (count < 1) {
            System.out.println("1 Строка №" + count);
            count++;
        }
                    // Оператор break
        count = 1;
        while (true) {
            System.out.println("Для BREAK Строка №" + count);
            if (count > 3) {
                break;
            }
            count++; // Без наращивания цикл будет выполняться вечно
        }

                    //  do ... while
        count = 1;
        do {
            System.out.println("2 Строка №" + count);
            count++;

        }
        while (count < 3);

                //  Цикл for
        count = 1;
        for (; ;) {
            if (count < 4) {
                System.out.println("For Строка №" + count);
            } else {
                break;
            }
            count++; // можно сделать так как в примере ниже заменив переменную i на count
        }

        for (int i = 1; i < 6; i++) {
            System.out.println("Для for Строка №" + i);
        }


    }
}

