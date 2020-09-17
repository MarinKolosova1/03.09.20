package Animal;

public class Horse extends Animal {
    boolean tookRide = false;

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    void makeNoise() {
        System.out.println("Лошадка цокает.");
    }

    @Override
    void eat() {
        System.out.println("Лошадка ест: " + food);
    }
}

