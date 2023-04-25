package org.example.homework_nr_8;

public class ElephantHerbivore extends Herbivore {
    public ElephantHerbivore(String name, int age) {
        super(name, age);
    }

    public void findFood() {
        System.out.println("Elephant looks around while eating");
    }
}
