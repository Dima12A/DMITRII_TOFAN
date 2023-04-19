package org.example.homework_nr_7;



public class main {
    public static void main(String[] args) {
        Person pers = new Person("Max", "Vieru,20/6");
        Student stud = new Student("Oleg", "Alexandri,12 ");
        Staff stff = new Staff("Vasea", "Dimo,16");

        System.out.println(pers);
        System.out.println(stud);
        System.out.println(stff);


        System.out.println("---------------------------------------------");

        // геометрические фигуры

        Circle circle = new Circle(5);
        Square square = new Square(4);
        Sphere sphere = new Sphere(3);
        Cube cube = new Cube(2);

        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Area of square: " + square.getArea());
        System.out.println("Surface area of sphere: " + sphere.getArea());
        System.out.println("Volume of sphere:" + sphere.getVolume());
        System.out.println("Surface area of cube: " + cube.getArea());
        System.out.println("Volume of cube: " + cube.getVolume());
    }

}



