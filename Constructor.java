
import java.util.Scanner;

class Customer{
	private String name;
	int age;
	
	Customer(String n , int a) {
		this.name = n;
		this.age =a;
	}
	
	public String display() {
		return name;
	}
}
public class Constructor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		scan.nextLine();
		String name = scan.nextLine();
		Customer cus = new Customer(name,age);
		System.out.println(cus.display());
		scan.close();
	}

}
