package HashTables_RansomNote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();    
        List<String> listMagazine = new ArrayList<>();
        List<String> listRansom = new ArrayList<>();
        for(int i=0;i<m;i++) {
       	listMagazine.add(in.next());
        }
        for(int i=0;i<n;i++) {
        	listRansom.add(in.next());
        }
        for(int i=0;i<n;) {
        	for(int j=0;j<m;){
        		if(listRansom.get(i).equals(listMagazine.get(j))) {
        			listRansom.remove(i);
        			listMagazine.remove(j);
        			n--;
        			m--;
        			j=0;
        			break;
        		}else {
        			if(j==listMagazine.size()-1) {
        				System.out.println("No");
        				n=0;
        				break;
        			}
        			j++;
        		}
        	}
        }
        
        if(listRansom.isEmpty()) {
        	System.out.println("Yes");
        }
    }
}
