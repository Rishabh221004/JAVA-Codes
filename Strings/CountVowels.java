package Strings;
import java.util.Scanner;
public class CountVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str=sc.nextLine();
		int n=str.length();
		int count=0;
		for(int i=0;i<n;i+=1) {
			char ch=str.charAt(i);
			if(isVowel(ch)==true) count+=1;
		}
		System.out.println(count);
		sc.close();
	
	}
	public static boolean isVowel(char ch) {
		if(ch=='a' || ch=='A') return true;
		if(ch=='e' || ch=='E') return true;
		if(ch=='i' || ch=='I') return true;
		if(ch=='o' || ch=='O') return true;
		if(ch=='u' || ch=='U') return true;
		else return false;
	}

}
