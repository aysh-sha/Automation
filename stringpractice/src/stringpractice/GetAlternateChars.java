package stringpractice;

import java.util.Scanner;

public class GetAlternateChars {
	
	public static String trim(String s)
	{
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<s.length();i+=2)
		{
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word");
		String s= sc.next();
     String  m=trim(s);
     System.out.println(m);
    

     
}

}

