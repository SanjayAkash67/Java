import java.util.Scanner;
public class arr {
    public static void main(String[] args) {
        Scanner arr = new Scanner(System.in);
        int size = arr.nextInt();
        int[] array1 = new int[size];
        for (int i = 0; i < size; i++) {
            array1[i] = arr.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array1[i]);
        }
    }
}