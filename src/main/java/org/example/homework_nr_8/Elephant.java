package org.example.homework_nr_8;

public class Elephant implements Animalble {
    private String name;
    private int age;
    private double weight;

    public Elephant(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("The Elephant is eating and making om mnom mnom");
    }

    public void sleep() {
        System.out.println("The Elephant is sleeping on legs");
    }

    public void move() {
        System.out.println("The Elephant is walking - step by step");
    }

    @Override
    public void sound() {
        System.out.println("Elephant is the best singer in Africa");
    }


    public void printInfo(String name, int age, double weight) {
        System.out.println("Elephant name: " + name + ", Age: " + age + ", Weight: " + weight);
    }

    @Override
    public void printInfo() {

    }


}
