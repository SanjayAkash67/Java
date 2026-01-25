// MainDemo.java

// Base Employee class
class Employee {
    public void work() {
        System.out.println("Employee is working.");
    }
}

// Manager inherits Employee
class Manager extends Employee {
    public void manage() {
        System.out.println("Manager is managing.");
    }
}

// Vehicle hierarchy
class Vehicle {
    public void fuelType() {
        System.out.println("Vehicle uses fuel.");
    }
}

class Bike extends Vehicle {
    public void speed() {
        System.out.println("Bike speed is 80 km/h.");
    }
}

// Person → Student
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

// LivingBeing → Human → Teacher
class LivingBeing {
    public void breathe() {
        System.out.println("LivingBeing is breathing.");
    }
}

class Human extends LivingBeing {
    public void think() {
        System.out.println("Human is thinking.");
    }
}

class Teacher extends Human {
    public void teach() {
        System.out.println("Teacher is teaching.");
    }
}

// Animal → Mammal → Dog
class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

class Mammal extends Animal {
    public void walk() {
        System.out.println("Mammal is walking.");
    }
}

class Dog extends Mammal {
    public void bark() {
        System.out.println("Dog is barking.");
    }
}

// Company → Department → CompanyEmployee
class Company {
    String companyName;

    public Company(String companyName) {
        this.companyName = companyName;
    }
}

class Department extends Company {
    String departmentName;

    public Department(String companyName, String departmentName) {
        super(companyName);
        this.departmentName = departmentName;
    }
}

class CompanyEmployee extends Department {
    String employeeName;

    public CompanyEmployee(String companyName, String departmentName, String employeeName) {
        super(companyName, departmentName);
        this.employeeName = employeeName;
    }

    public void displayDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Department Name: " + departmentName);
        System.out.println("Employee Name: " + employeeName);
    }
}

// Main class
public class Cap {
    public static void main(String[] args) {

        System.out.println("---- Employee & Manager ----");
        Manager manager = new Manager();
        manager.work();
        manager.manage();

        System.out.println("\n---- Vehicle & Bike ----");
        Bike bike = new Bike();
        bike.fuelType();
        bike.speed();

        System.out.println("\n---- Person & Student ----");
        Student student = new Student("Sanjay", 20);
        student.displayDetails();

        System.out.println("\n---- LivingBeing → Human → Teacher ----");
        Teacher teacher = new Teacher();
        teacher.breathe();
        teacher.think();
        teacher.teach();

        System.out.println("\n---- Animal → Mammal → Dog ----");
        Dog dog = new Dog();
        dog.eat();
        dog.walk();
        dog.bark();

        System.out.println("\n---- Company → Department → CompanyEmployee ----");
        CompanyEmployee emp = new CompanyEmployee(
                "TechCorp",
                "Development",
                "Akash"
        );
        emp.displayDetails();
    }
}
