package org.example.homework_nr_8;

public abstract class Herbivore {
    protected String name;
    protected int age;

    public Herbivore(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void findFood();

    public void rest() {
        System.out.println("Herbivore - is good food for predators (when resting) ");
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Age:" + age);
    }
}
