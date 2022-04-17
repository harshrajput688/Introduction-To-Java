/*
Code : Triangle of Numbers

Print the following pattern for the given number of rows.
Pattern for N = 4



The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
           1
         232
       34543
     4567654
   567898765
Sample Input 2:
4
Sample Output 2:
           1
         232
       34543
     4567654
*/
import java.util.Scanner;

public class TriangleofNumbers {

	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		while(i <= n) {
			
			int spaces = 1;
			while(spaces <= n-i) {
				System.out.print(" ");
				spaces++;
			}
			int j =  1;
			int val = i;
			while(j <= i) {
				System.out.print(val);
				val++;
				j++;
			}
			val = i;
			int a = 1;
			while(a <= i-2) {
				val=val+1;
				a++;
			}
			
			j = 1;
			while(j <= i-1) {
				System.out.print(val);
				val--;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
