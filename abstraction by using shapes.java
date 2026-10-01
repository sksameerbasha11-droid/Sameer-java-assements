// Abstract class
abstract class Shape {

    // Abstract method
    abstract void area();

    // Normal method
    void display() {
        System.out.println("This is a shape");
    }
}

// Subclass 1
class Circle extends Shape {

    double radius = 5;

    // Implementing abstract method
    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

// Subclass 2
class Rectangle extends Shape {

    double length = 10;
    double width = 5;

    // Implementing abstract method differently
    @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle = " + result);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.display();
        s1.area();

        s2.display();
        s2.area();
    }
}


Output:

This is a shape
Area of Circle = 78.53981633974483
This is a shape
Area of Rectangle = 50.0

How abstraction works here
             Shape (abstract class)
                    |
             abstract area()
               /         \
              /           \
         Circle          Rectangle
           |                 |
       area()            area()
     π × r × r            l × w


Shape is an abstract class, so we cannot create new Shape().

area() is an abstract method with no implementation in Shape.

Circle and Rectangle provide their own implementations of area().

Shape s1 = new Circle() and Shape s2 = new Rectangle() demonstrate polymorphism.

The user only needs to know that every Shape has an area() method; the actual calculation is hidden inside each subclass. This is abstraction.
