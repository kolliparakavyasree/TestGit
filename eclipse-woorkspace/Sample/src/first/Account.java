package first;


public class Account {
	int id;
	int balance;
	String name;
	
	Account(int id,int balance, String name){
		this.id = id;
		this.balance = balance;
		this.name = name;
	}
	
	public int withdraw(int amount) throws InSufficientBalance{
		if(amount>this.balance) {
			try {
				throw new InSufficientBalance("Insufficient Balance");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}else {
			this.balance = this.balance - amount;
		}
		return this.balance;
	}
	
	public int Deposit(int amount) {
		this.balance = this.balance + amount;
		return this.balance;
	}

}

class InSufficientBalance extends Exception 
{ 

	private static final long serialVersionUID = 1L;

	public InSufficientBalance(String s) 
    { 
        // Call constructor of parent Exception 
        super(s); 
    } 
} 
