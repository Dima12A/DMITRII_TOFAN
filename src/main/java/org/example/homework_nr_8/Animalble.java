package org.example.homework_nr_8;

public interface Animalble {

    void eat();
    void sleep();
    void move();
    void sound();

    default void printInfo(String name, int age, double weight) {
        System.out.println("Name: " + name + ", Age: " + age + ", Weight: " + weight);
    }

    public static final String CATEGORY = "Mammal";

    void printInfo();
}
