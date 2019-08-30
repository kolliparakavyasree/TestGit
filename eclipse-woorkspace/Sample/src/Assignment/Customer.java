package Assignment;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,CustomerDetails> customers = new HashMap<Integer,CustomerDetails>();
		customers.put(101,new CustomerDetails(101,"Kavya"));
		customers.put(102,new CustomerDetails(102,"Keerthi"));
		customers.put(103,new CustomerDetails(103,"Anya"));
		int choice;
		while(true){
			System.out.println("Menu: 1.Create Customer 2.View Customer");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("Enter Customer id and Name:");
				int id = sc.nextInt();
				String name = sc.next();
				customers.put(id,new CustomerDetails(id,name));
				System.out.println("Added...!");
			}else if(choice == 2){
				System.out.println("Enter customer id to view customer");
				int customer = sc.nextInt();
//				System.out.println(customers);
				System.out.println("Customer Id:"+customer+" Customer Name:"+ customers.get(customer).name);
			}else {
				break;
			}
			sc.close();
		}
		System.out.println("Done...!");
	}

}

class CustomerDetails{
	int id;
	String name;
	
	public CustomerDetails(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
