/*
Code : Interesting Alphabets

Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Input format :
N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG
*/
import java.util.Scanner;
public class InterestingAlphabets {
	public static void main(String[] args) {
		//Your code goes here
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = n;
		while(i >= 1) {
			char val = (char)('A' + i - 1);
			int j = 1;
			while(j <= n - i + 1) {
				System.out.print(val);
				val++;
				j++;
			}
			System.out.println();
			i--;
		}
	}
}
