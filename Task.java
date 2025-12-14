public class Task {
    public static void main(String[] args) {
        int number = 10;
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        int age = 18;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
        
        int value = -5;
        if (value > 0) {
            System.out.println(value + " is positive");
        } else if (value < 0) {
            System.out.println(value + " is negative");
        } else {
            System.out.println(value + " is zero");
        }

        int a = 15, b = 20, c = 10;
        if (a > b && a > c) {
            System.out.println(a + " is the largest");
        } else if (b > a && b > c) {
            System.out.println(b + " is the largest");
        } else {
            System.out.println(c + " is the largest");
        }

        int day = 3;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }

        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers: " + sum);

        String text = "Hello World";
        int vowels = 0, consonants = 0;
        for (char ch : text.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".contains(String.valueOf(ch))) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);

        int num1 = 20, num2 = 5;
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));

        for    (int i = 1; i <= 5; i++) {
                System.out.print(i);
                System.out.println("");
            }

        for (int i = 5; i >= 1; i--) {
                System.out.print(i);
                System.out.println("");
            }
        
        int n1 = 10;
        int sum1 = 0;
        for (int i = 1; i <= n; i++) {
            sum1 += i;
        }
        System.out.println("Sum of first " + n1 + " natural numbers: " + sum1);

        if (sum1 % 2 == 0) {
            System.out.println(sum1 + " is even");
        } else {
            System.out.println(sum1 + " is odd");
        }

        for (int j = 0; j<=10;j=j+2){
            System.out.println(j);
        }

        int i = 1;
        while (i <= 10) {
            System.out.println("11 * " + i + " = " + (11 * i));
            i++;
        }


        for (int k = 1; k <= 100; k++) {
            System.out.println(k);
        }

        for (int m = 2; m <= 50; m += 2) {
            System.out.println(m);
        }
        
        int factorial = 1;
        for (int f = 1; f <= 5; f++) {
            factorial *= f;
        }
        System.out.println("Factorial of 5: " + factorial);

        for (int x = 1; x<=10;x++){
            System.out.println(x*x);
        }

        int num = 1;
        while (num <= 30) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
            num++;
        }

        for (int p = 1; p <= 10; p++) {
            System.out.println("7 * " + p + " = " + (7 * p));
        }
    }
}