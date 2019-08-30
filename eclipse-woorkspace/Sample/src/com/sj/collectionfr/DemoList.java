package com.sj.collectionfr;

import java.util.*;

public class DemoList {
	public static void main(String args[]) {
		ArrayList<String> cities = new ArrayList<String>();
		cities.add("Hyderabad");
		cities.add("Delhi");
		cities.add("Pune");
		
		Iterator<String> cityItr = cities.iterator();
		
		while(cityItr.hasNext()) {
			System.out.println(cityItr.next().length());
		}
		
//		for(String city:cities) {
//			System.out.println( city.length());
//		}
		
	}
}
