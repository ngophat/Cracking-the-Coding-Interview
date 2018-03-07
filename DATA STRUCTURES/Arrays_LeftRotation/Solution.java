package Arrays_LeftRotation;

import java.util.Scanner;

public class Solution {
	public static void arrayLeftRotation(int[] a, int n, int k) {
		int flag;
		int iCount=1;
		if(k >= n){
		     for(int y=1;y*n<k;y++){
		        iCount=y;
		     }
		     k=k-n*iCount;
		     for(int i=0;i<k;i++) {
		        for(int j=0; j<n-1;j++) {
		        	 	flag=a[j];
			    		a[j]=a[j+1];
			    		a[j+1]=flag;
			    }
			 }
		}else{
		     for(int i=0;i<k;i++) {
		    	 for(int j=0; j<n-1;j++) {
			    	flag=a[j];
			    	a[j]=a[j+1];
			    	a[j+1]=flag;
			    }
			}
		}
	    for(int e: a ) {
	    	System.out.print(e+" ");
	    }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }
        arrayLeftRotation(a, n, k);
    }
}
