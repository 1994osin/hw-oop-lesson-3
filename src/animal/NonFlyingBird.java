package animal;

public class NonFlyingBird extends Bird {
    private String movement;

    public NonFlyingBird(String name, int age, String environment, String movement) {
        super(name, age, environment, movement);
    }

    @Override
    public void eat() {
        System.out.println("Нелетающая птица " + getName() + " ест на земле");
    }

    @Override
    public void sleep() {
        System.out.println("Нелетающая птица " + getName() + " спит ночью");
    }

    @Override
    public void go() {
        System.out.println("Нелетающая птица " + getName() + " перемещается по " + getEnvironment());
    }

    @Override
    public void hunt() {
        System.out.println("Нелетающая птица " + getName() + " охотится на земле");
    }
}
