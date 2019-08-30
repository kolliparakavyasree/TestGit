package first;

public class User {
	
	public static void main(String args[]) throws InSufficientBalance {
		Printable p[] = new Printable[2];
		p[0] = new Emp(1001,"kavya");
//		p[0].print();
		p[1] = new Date(21,8,2019);
//		p[1].print();
		Util.printAll(p);
		
		System.out.println();
		Account a = new Account(11,30000,"Kavya");
		a.withdraw(32000);
	}
	
}
