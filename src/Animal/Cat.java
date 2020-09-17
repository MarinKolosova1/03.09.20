package Animal;

public class Cat extends Animal {
    boolean sharpenedClaws = false;

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    void makeNoise() {
        System.out.println("Кошечка мяукает.");
    }

    @Override
    void eat() {
        System.out.println("Кошечка ест: " + food);
    }
}
