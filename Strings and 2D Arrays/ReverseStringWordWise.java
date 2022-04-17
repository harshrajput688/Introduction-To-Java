/*
Reverse String Word Wise

Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
Input format :
String in a single line
Output format :
Word wise reversed string in a single line
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome
Sample Input 2:
Always indent your code
Sample Output 2:
code your indent Always
*/
public class ReverseStringWordWise {
	public static String reverseWordWise(String str) {
		// Write your code here

        String rev = "";
        for(int j = str.length()-1;j>=0;j--){
            String str1 = "";
        for(int i = j ; i>=0;i--){
            if(str.charAt(i) == ' '){
                break;
            }else{
                str1 = str1 + str.charAt(i);
            }
            j--;
        }
        for(int k = str1.length()-1;k>=0;k--){
            rev = rev+str1.charAt(k);
        }
        rev=rev+' ';
        }
        return rev;
	}
}
