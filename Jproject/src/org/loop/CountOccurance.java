package org.loop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOccurance {
	public static void main(String[] args) {
		
		String s = "Java is based on oop";
				
        int length = s.length();
        int aftrremoved = s.replace("e", "").length();
        int count = length -  aftrremoved;
        System.out.println("a count is:" +count);
		//Map<Character, Integer> charmap = new HashMap<Character, Integer>();
	
	}

}
