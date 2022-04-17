/*
Code : Diamond of stars

Print the following pattern for the given number of rows.
Note: N is always odd.


Pattern for N = 5



The dots represent spaces.



Input format :
N (Total no. of rows and can only be odd)
Output format :
Pattern in N lines
Constraints :
1 <= N <= 49
Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *
Sample Input 2:
3
Sample Output 2:
  *
 ***
  *
*/
import java.util.Scanner;
public class Diamondofstars {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		int n1 = (N+1)/2;
		int n2 = n1-1;
		
		int i = 1;
		while(i <= n1) {
			int space = 1;
			while(space <= n1-i) {
				System.out.print(" ");
				space++;
			}
			int j =1;
			while(j <= i*2 -1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		i = n2;
		while(i >= 1) {
			int space = 1;
			while(space <= n2-i+1) {
				System.out.print(" ");
				space++;
			}
			
			int j = 1;
			while(j <= i*2-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i--;
		}

    }
}
