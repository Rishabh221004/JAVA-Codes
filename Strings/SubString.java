package Strings;

public class SubString {

	public static void main(String[] args) {
		String s="abcde";
		for(int i=0;i<=s.length();i+=1) {
			for(int j=i+1;j<=s.length();j+=1) {
				System.out.print(s.substring(i,j)+" ");
			}
			System.out.println();
		}

	}

}
