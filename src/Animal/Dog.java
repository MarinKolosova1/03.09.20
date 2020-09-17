package Animal;

public class Dog extends Animal {
    boolean tookWalk = false;

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    void makeNoise() {
        System.out.println("Собачка лает.");
    }

    @Override
    void eat() {
        System.out.println("Собачка ест: " + food);
    }
}
