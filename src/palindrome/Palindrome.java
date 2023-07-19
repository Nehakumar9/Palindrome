package palindrome;

import java.util.Scanner;

public class Palindrome {

	public static int palindrome(String s,int start,int end) {
		char[] ch = s.toCharArray();
		if(ch[start]!=ch[end]) {
			return 0;
		}
		if(start>end) {
			return 1;
		}
		return palindrome(s,start+1,end-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int start = 0;
		int end = s.length()-1;
		int results = palindrome(s,start,end);
		System.out.println(results);
	}

}
