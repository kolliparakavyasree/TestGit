package com.sj.dao;

import java.util.*;

import com.sj.model.Customer;

public class User {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CustomerDAOImplementation cust=new CustomerDAOImplementation();
		System.out.println("\nenter n (number of times you want to view or insert) :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("\nenter 1 or 2:\n1. view\n2. Insert \n3. Update\n4. Delete\n");
			int j=sc.nextInt();
			switch(j)
			{
			case 1:
				cust.viewDetails();
				break;
			case 2:
				System.out.println("\nenter id, name, loc: \n"); 
				int id=sc.nextInt();
				String name=sc.next();
				String loc=sc.next();
				Customer c=new Customer(id, name, loc);
				cust.createCust(c.getId(),c.getName(),c.getLoc());
				break;
//			case 3:
//				System.out.println("\nUpdate what???? \n1.id \n2. name\n3. loc ");
//				int j=sc.nextInt();
				//UpdateCust(int id,String name,String loc)

//				break;
//			case 4:
//				System.out.println("\nenter id, name, loc: \n"); 
//				int j=sc.nextInt();
				//DeleteCust(int id,String name,String loc);
//				break;
				default:
					System.out.println("\nenter 1 or 2 or 3 or 4 only.........");
			}
		}
	}
}
