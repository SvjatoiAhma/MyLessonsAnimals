package svjat.animals;

public class StartPoint {
    public static void main(String[] args) {

        Animals horse = new Horse();
        Animals pig = new Pig();
        Animals cow = new Cow();
        Shark shark = new Shark();

        boolean sharkIsAnimals = horse.equals(shark);
        System.out.println(sharkIsAnimals);
        boolean pigIsShark = pig.equals(shark);
        boolean pigIsHorse = pig.equals(horse);
    }


}

