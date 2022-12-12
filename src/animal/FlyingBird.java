package animal;

public class FlyingBird extends Bird {
    private String movement;

    public FlyingBird(String name, int age, String environment, String movement) {
        super(name, age, environment, movement);
    }

    @Override
    public void eat() {
        System.out.println("Летающая птица " + getName() + " ест в воздухе");
    }

    @Override
    public void sleep() {
        System.out.println("Нелетающая птица " + getName() + " спит днем");
    }

    @Override
    public void go() {
        System.out.println("Нелетающая птица " + getName() + " перемещается по " + getEnvironment());
    }

    @Override
    public void hunt() {
        System.out.println("Нелетающая птица " + getName() + " охотится в воздухе");
    }
}
