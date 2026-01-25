// Main class
public class Interface {
    public static void main(String[] args) {
        // Interface reference, class object
        Test t = new My();
        t.meth1();
        t.meth2();
        System.out.println("--");

        // In the main method, display the sound of the dog
        // Example usage:

        Dog dog = new Dog();
        dog.sound();

        // Example usage:
        Shape s1 = new Rectangle();
        s1.areaFormula();

        Shape s2 = new Circle();
        s2.areaFormula();


        // Example usage in main method:
        Payment upiPayment = new UPI();
        upiPayment.pay();

        Payment cardPayment = new Card();
        cardPayment.pay();
    }
}

/*---------------------------------------------------------------------------------------------------*/

// Interface
interface Test {
    void meth1();
    void meth2();
}
// Class implementing interface
class My implements Test {
    @Override
    public void meth1() {
        System.out.println("Meth1 of class My");
    }

    @Override
    public void meth2() {
        System.out.println("Meth2 of class My");
    }
}

/*---------------------------------------------------------------------------------------------------*/

interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}

/*---------------------------------------------------------------------------------------------------*/

interface Shape {
    void areaFormula();
}

class Rectangle implements Shape {
    @Override
    public void areaFormula() {
        System.out.println("Area of Rectangle = length * breadth");
    }
}

class Circle implements Shape {
    @Override
    public void areaFormula() {
        System.out.println("Area of Circle = π * radius * radius");
    }
}

/*---------------------------------------------------------------------------------------------------*/

interface Payment {
    void pay();
}

class UPI implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using UPI");
    }
}

class Card implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using Card");
    }
}

/*---------------------------------------------------------------------------------------------------*/ 