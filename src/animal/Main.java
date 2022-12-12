package animal;

public class Main {
    public static void main(String[] args) {
        Animal horse = new Herbivore("лошадь", 6, "земля", 70, "трава");
        Animal giraffe = new Herbivore("жираф", 1, "земля", 30, "трава");
        Animal gazelle = new Herbivore("газель", 9, "земля", 55, "трава");

        Animal tiger = new Predator("тигр", 2, "лес", 40, "мясо");
        Animal hyena = new Predator("гиена", 3, "лес", 35, "мясо");
        Animal bear = new Predator("медведь", 7, "лес", 25, "мясо, мед, фрукты");

        Animal frog = new Amphibian("лягушка", 2, "вода и земля");
        Animal freshwater = new Amphibian("уж пресноводный", 4, "вода и земля");

        Animal penguin = new NonFlyingBird("пингвин", 5, "лед", "ноги");
        Animal peacock = new NonFlyingBird("павлик", 3, "земля", "ноги");

        Animal falcon = new FlyingBird("сокол", 1, "воздух", "крылья");
        Animal seagull = new FlyingBird("чайка", 3, "воздух", "крылья");

        horse.go();
    }
}
