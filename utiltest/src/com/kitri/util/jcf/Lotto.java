package com.kitri.util.jcf;

import java.util.*;

import org.xml.sax.HandlerBase;

public class Lotto {
	public static void main(String[] args) {
/*		Set<String> set = new HashSet<String>();
		
		set.add((int) (Math.random()*45) + "");
		set.add((int) (Math.random()*45) + "");
		set.add((int) (Math.random()*45) + "");
		set.add((int) (Math.random()*45) + "");
		set.add((int) (Math.random()*45) + "");
		set.add((int) (Math.random()*45) + "");
		
		String str[] = set.toArray(new String[0]);

		int len = str.length;
		for (int i = 0; i < len; i++) 
			if(str[i].equals("0"))
				continue;
			else
			System.out.println((i+1) + ". " +str[i] + " ");
*/
		Random random = new Random();
		Set<Integer> set = new HashSet<Integer>();
		while(true) {
			set.add(random.nextInt(45) + 1);
			if(set.size() == 6)
				break;
		}
		Integer number[] = set.toArray(new Integer[0]);
		int len = number.length;
		for (int i = 0; i < len; i++) {
			System.out.println((i+1) + ". " + number[i]);
			
		}
		
	}

}
