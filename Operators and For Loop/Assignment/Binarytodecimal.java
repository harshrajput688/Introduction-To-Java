/*
Binary to decimal

Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
*/
import java.util.Scanner;
public class Binarytodecimal {
	
	public static void main(String[] args) {
		// Write your code here

        Scanner s = new Scanner(System.in);
		int binary = s.nextInt();
		int decimal = 0;
		int value = 1;
		while(binary > 0) {
			int lastdigit = 0;
			lastdigit = binary%10;
			binary = binary/10;
			
			decimal += lastdigit*value;
			value = value*2;
		}
		System.out.print(decimal);

	}
}
