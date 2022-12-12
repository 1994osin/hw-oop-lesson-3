package animal;

public class Predator extends Mammal {
    public Predator(String name, int age, String environment, int speed, String food) {
        super(name, age, environment, speed, food);
    }

    public void hunt() {
        System.out.println("Хищник " + getName() + " охотится");
    }

    @Override
    public void eat() {
        System.out.println("Хищник " + getName() + " питается " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Хищник " + getName() + " спит днем");
    }

    @Override
    public void go() {
        System.out.println("Хищник " + getName() + " ходид в лесу");
    }

    @Override
    public void walk() {
        System.out.println("Хищник " + getName() + " гуляет в лесу");
    }
}
