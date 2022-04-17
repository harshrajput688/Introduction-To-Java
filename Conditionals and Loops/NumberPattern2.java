/*
Number Pattern 2
Send Feedback
Print the following pattern
Pattern for N = 4


The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Sample Input :
5
Sample Output :


The dots represent spaces.
*/
import java.util.Scanner;
public class NumberPattern2 {


	public static void main(String[] args) {
	

		 Scanner s = new Scanner(System.in);
	       int n = s.nextInt();
	       int val = 1;
	       
	       int i = 1;
	       
	       while(i <= n) {
	    	   
	    	   val = i;
	    	   
	    	   int space = 1;
	    	   while(space <= n-i) {
	    		   System.out.print(" ");
	    		   space = space + 1;
	    	   }
	    	   int j = 1;
	    	   while(j <= i) {
	    		   System.out.print(val);
	    		   val = val + 1;
	    		   j = j + 1;
	    	   }
	    	   System.out.println();
	    	   i = i+1;
	       }
	       

	}

}
