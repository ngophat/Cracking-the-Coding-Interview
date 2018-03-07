package Strings_MakingAnagrams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static int numberNeeded(String first, String second) {
      	int numberNeeded=0;
		List<Character> listA = new ArrayList<>(); 
		List<Character> listB = new ArrayList<>(); 
		for(int a=0;a<first.length();a++) {
			listA.add(first.charAt(a));
		}
		for(int a=0;a<second.length();a++) {
			listB.add(second.charAt(a));
		}
		int i=0;
		while(i<listA.size()) {
			int j=0;
			while(j<listB.size()) {
				if(listA.get(i).equals(listB.get(j))) {
					listA.remove(i);
					listB.remove(j);
					i=0;
					j=0;
				}
				j++;
			}
			i++;
		}
		numberNeeded = listA.size() + listB.size();
//		System.out.println(numberNeeded);
		return numberNeeded;
  
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
