import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("You entered: " + a);
        String b;
        b = input.next();
        System.out.println("You entered: " + b);
        
    }
}