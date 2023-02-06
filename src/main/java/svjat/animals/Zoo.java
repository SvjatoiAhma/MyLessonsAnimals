package svjat.animals;

import java.util.ArrayList;
import java.util.Collection;

public class Zoo {
    public static void main(String[] args) {
        Collection listZoo = new ArrayList();
        listZoo.add("Pig");
        listZoo.add("Lion");
        listZoo.add("Bear");
        listZoo.add("Cow");
        listZoo.add("Horse");
        listZoo.add("Shark");

        for(Object o:listZoo){
            System.out.println("Список животных: " + o);
        }
        Collection listZoo2 = new ArrayList();
        listZoo2.addAll(listZoo);
        listZoo2.remove("Shark");

        for(Object o:listZoo2) {
            System.out.println("Список без рыб " + o);
        }

        String[] daysOfWeek =
                { "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье" };

        for (String dayOfWeek : daysOfWeek) {
            System.out.print(dayOfWeek + " ");
        }

    }
}