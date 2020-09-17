package Animal;

public abstract class Animal {

    String food, location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    abstract void makeNoise();

    abstract void eat();

    public void sleep() {
        System.out.println("Животное спит в: " + this.location);
    }
}


