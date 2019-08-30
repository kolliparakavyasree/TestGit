package com.sj.collectionfr;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMap {
	
	public static void main(String args[]) { 
		
		HashMap<String,Integer> metros = new HashMap<String,Integer>();
		
		metros.put("Mumbai", 5000000 );
		metros.put("Delhi", 4000000 );
		metros.put("Chennai", 3000000 );
		
		System.out.println("Population of Delhi:"+ metros.get("Delhi"));
		
		Set<Entry<String,Integer>> metrosEntries = metros.entrySet();
		Iterator<Entry<String,Integer>> metroItr = metrosEntries.iterator();
		while(metroItr.hasNext()) {
			System.out.println(metroItr.next());
		}
		
		System.out.println(metros);
	}
	
}
