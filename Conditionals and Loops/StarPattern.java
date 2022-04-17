/*
Star Pattern
Send Feedback
Print the following pattern
Pattern for N = 4



The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******
*/
import java.util.Scanner;
public class StarPattern {


	public static void main(String[] args) {
		
		

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int i = 1;
		while(i <= n) {
			
			int space = 1;
			while(space <= n-i) {
				System.out.print(" ");
				space = space + 1;
			}
			
			int j = 1;
			while(j <= i) {
				System.out.print("*");
				j = j+1;
			}
			
			int exStar = 1;
			while(exStar <= i-1) {
				System.out.print("*");
				exStar = exStar + 1;
			}
			System.out.println();
			i = i + 1;
		}

	}

}
