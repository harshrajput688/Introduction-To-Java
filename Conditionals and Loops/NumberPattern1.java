/*
Number Pattern 1

Print the following pattern
Pattern for N = 4
1
23
345
4567
Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Sample Input 1 :
3
Sample Output 1 :
1
23
345
*/
import java.util.Scanner;
public class NumberPattern1 {


	public static void main(String[] args) {
		
		

		 Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int val = 1;
       
       int i = 1;
       
       while(i <= n) {
    	   
    	   val = i;
    	   
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
