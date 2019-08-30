package first;

public class Date implements Printable {
	int day;
	int month;
	int year;
	
	Date(int day,int month,int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void print() {
		System.out.println("Date Provided:"+day+"/"+month+"/"+year);
	}
}
