package org.example.homework_nr_3;

public class Circle {
    // переменная класса -> radius
    double radius;

    public Circle(double radius){
        this.radius = radius;

    }
    public double calculateArea(){
        return 3.14 * (radius * radius);

    }
    public static void main(String[] args) {
        double radius = 14.18;
        // создание объекта из класса
        Circle circle = new Circle(radius);

        double area = circle.calculateArea();
        System.out.println("Площадь круга с радиусом " + radius + " = " + area);
    }
}

