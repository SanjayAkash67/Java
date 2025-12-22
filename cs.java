
import java.util.Scanner;

class Customer{
	
	Customer(String n,byte a){
		this.name=n;
		this.age=a;
	}
	private String name;
	byte age;
	
	//set method
	
	
	//method declaration
	public String display() {
		return name;
	}
}


public class cs {

	public static void main(String[] args) {
		System.out.println("Before");
		Scanner in = new Scanner(System.in);
		String name=in.nextLine();
		byte age = in.nextByte();
		Customer cus = new Customer(name,age);
		
		
		//method call
		System.out.println(cus.display());
		
	}

}
