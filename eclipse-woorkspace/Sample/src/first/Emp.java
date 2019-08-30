package first;

public class Emp implements Printable {
	int id;
	String name;
	
	Emp(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public void print() {
		System.out.println("Employee Id:"+this.id+" Employee Name:"+this.name);
		
	}

}
