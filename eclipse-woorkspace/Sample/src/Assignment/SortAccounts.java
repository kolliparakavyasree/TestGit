package Assignment;

import java.util.Comparator;
import java.util.TreeSet;

public class SortAccounts {
	 
	public static void main(String[] args){
	        Account acc1=new Account(5,5000,"Kavya");
	        Account acc2=new Account(3,6000,"Shirisha");
	        Account acc3=new Account(30,60400,"Anya");
	        Account acc4=new Account(12,60600,"Keer");
	        Account acc5=new Account(6,10000,"Someone");
	        TreeSet<Account> ts=new TreeSet<Account>(new idComparator());
	        ts.add(acc1);
	        ts.add(acc2);
	        ts.add(acc3);
	        ts.add(acc4);
	        ts.add(acc5);
//	        System.out.println(ts);
	        for(Account me:ts){
	            System.out.println("Id :"+me.id+" Name : "+me.name+" Balance :"+me.balance);
	        }
	}
}

class idComparator implements Comparator<Account> { 
    public int compare(Account a1, Account a2) 
    {   
        return a1.id - a2.id ; 
    }
 
} 
