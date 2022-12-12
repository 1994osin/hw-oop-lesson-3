package animal;

public class Amphibian extends Animal {

    public Amphibian(String name, int age, String environment) {
        super(name, age, environment);
    }

    public void hunt() {
        System.out.println("Земноводное " + getName() + " оходится в воде и на земле");
    }

    @Override
    public void eat() {
        System.out.println("Земноводное " + getName() + " питается насекомыми");
    }

    @Override
    public void sleep() {
        System.out.println("Земноводное " + getName() + " спит в воде");
    }

    @Override
    public void go() {
        System.out.println("Земноводное " + getName() + " ходит около воды и плавает в воде");
    }
}
