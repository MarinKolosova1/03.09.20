package Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество животных:");
        int n = in.nextInt();
        String animalType, food, location;
        Animal[] animals = new Animal[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Введите тип животного (\"кошка\", \"собака\", \"лошадь\"):");
            animalType = in.next();
            System.out.println("Введите то, чем питается животное и где спит:");
            food = in.next();
            location = in.next();
            switch (animalType) {
                case "кошка" -> animals[i] = new Cat(food, location);
                case "собака" -> animals[i] = new Dog(food, location);
                case "лошадь" -> animals[i] = new Horse(food, location);
                default -> System.out.println("Неправильно указан тип животного!");
            }

        }
        for (int i = 0; i < n; i++) {
            Vet.treatAnimal(animals[i]);
        }
    }
}
