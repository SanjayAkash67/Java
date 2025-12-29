abstract class Shape{
    abstract void draw();
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();       // Output: Drawing Circle
        rectangle.draw();    // Output: Drawing Rectangle

        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.draw();       // Output: Drawing Circle
        bike.draw(); 
    }
}

abstract class Vehicle{
    abstract void draw();
}

class Car extends Vehicle{
    @Override
    void draw(){
        System.out.println("Drawing Circle");
    }
}

class Bike extends Vehicle{
    @Override
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}