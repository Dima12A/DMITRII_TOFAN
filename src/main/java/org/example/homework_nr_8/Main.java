package org.example.homework_nr_8;

public class Main {
    public static void main(String[] args) {
        Animalble elephant = new Elephant("Dumbo", 150, 3520);
        elephant.eat();
        elephant.sound();
        elephant.move();
        elephant.sleep();
        elephant.printInfo();

        System.out.println("Animal category: " + Animalble.CATEGORY);

        Herbivore elephant2 = new ElephantHerbivore("Jumbo", 69);
        elephant2.findFood();
        elephant2.rest();
        elephant2.printInfo();
    }
}
