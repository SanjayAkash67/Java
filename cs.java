
import java.util.Scanner;

class DressShop {

    void menDress(int choice) {
        switch (choice) {
            case 1 -> {
                System.out.println("Selected: Shirt");
                System.out.println("Price: ₹800");
            }
            case 2 -> {
                System.out.println("Selected: Pant");
                System.out.println("Price: ₹1200");
            }
            case 3 -> {
                System.out.println("Selected: Blazer");
                System.out.println("Price: ₹3000");
            }
            case 4 -> {
                System.out.println("Selected: Dhoti");
                System.out.println("Price: ₹1500");
            }
            default -> System.out.println("Invalid choice");
        }
    }

    void womenDress(int choice) {
        switch (choice) {
            case 1 -> {
                System.out.println("Selected: Saree");
                System.out.println("Price: ₹2500");
            }
            case 2 -> {
                System.out.println("Selected: Tops");
                System.out.println("Price: ₹900");
            }
            case 3 -> {
                System.out.println("Selected: Kurti");
                System.out.println("Price: ₹1400");
            }
            case 4 -> {
                System.out.println("Selected: Skirt");
                System.out.println("Price: ₹1600");
            }
            default -> System.out.println("Invalid choice");
        }
    }
}

public class cs {
    @SuppressWarnings({"ConvertToStringSwitch", "ConvertToTryWithResources"})
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DressShop shop = new DressShop();

        System.out.println("Enter Gender (Men/Women): ");
        String gender = sc.nextLine().toLowerCase();

        if (gender.equals("men")) {
            System.out.println("Choose Dress:");
            System.out.println("1. Shirt");
            System.out.println("2. Pant");
            System.out.println("3. Blazer");
            System.out.println("4. Dhoti");

            int choice = sc.nextInt();
            shop.menDress(choice);

        } else if (gender.equals("women")) {
            System.out.println("Choose Dress:");
            System.out.println("1. Saree");
            System.out.println("2. Tops");
            System.out.println("3. Kurti");
            System.out.println("4. Skirt");

            int choice = sc.nextInt();
            shop.womenDress(choice);

        } else {
            System.out.println("Invalid Gender Input");
        }

        sc.close();
    }
}
