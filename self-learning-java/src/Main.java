class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car is driving");
    }
}

class Boat extends Vehicle {
    @Override
    void move() {
        System.out.println("Boat is sailing");
    }
}

abstract class Shape {
    abstract void area();
}

class Rectangle extends Shape {
    int length, width;
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    @Override
    void area() {
        System.out.println("Area of rectangle: " + (length * width));
    }
}

class Circle extends Shape {
    int radius;
    Circle(int radius) {
        this.radius = radius;
    }
    @Override
    void area() {
        System.out.println("Area of circle: " + (Math.PI * radius * radius));
    }
}

interface Printable {
    void print();
}

class Student implements Printable {
    @Override
    public void print() {
        System.out.println("Student details");
    }
}

class Book implements Printable {
    @Override
    public void print() {
        System.out.println("Book details");
    }
}

public class Main {
    public static void main(String args[]) {
        // Polymorphism
        Vehicle myCar = new Car();
        Vehicle myBoat = new Boat();
        myCar.move();  // Output: Car is driving
        myBoat.move(); // Output: Boat is sailing

        // Abstract & Override
        Shape rect = new Rectangle(5, 7);
        Shape circ = new Circle(4);
        rect.area();   // Output: Area of rectangle: 35
        circ.area();   // Output: Area of circle: 50.265...

        // Interface
        Printable stu = new Student();
        Printable book = new Book();
        stu.print();   // Output: Student details
        book.print();  // Output: Book details
    }
}