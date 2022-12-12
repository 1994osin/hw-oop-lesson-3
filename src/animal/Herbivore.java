package animal;

public class Herbivore extends Mammal{
    public Herbivore(String name, int age, String environment, int speed, String food) {
        super(name, age, environment, speed, food);
    }

    public void graze() {
        System.out.println("Травоядное " + getName() + " пасется");
    }

    @Override
    public void eat() {
        System.out.println("Травоядное " + getName() + " питается " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Травоядное " + getName() + " спит ночью");
    }

    @Override
    public void go() {
        System.out.println("Травоядное " + getName() + " ходид по траве");
    }

    @Override
    public void walk() {
        System.out.println("Травоядное " + getName() + " гуляет по траве");
    }
}
