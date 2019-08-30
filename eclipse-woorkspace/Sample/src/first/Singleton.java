package first;

public class Singleton {
	
	private static Singleton singleObj;
	
	private Singleton() {
		super();
	}
	
	public static Singleton createObject() {
		if(singleObj==null) {
			singleObj = new Singleton();
			System.out.println("Object Created");
		}
		return singleObj;
	}
	
	public static void main(String args[]) {
		Singleton.createObject();
		Singleton.createObject();
		Singleton.createObject();
	}
	
}
