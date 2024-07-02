package stringpractice2;

import java.util.Scanner;



public class CharIndex {
	
	public static void Index(String str,int index) {
		int len=str.length();
		if (index >0 && index < str.length()) {
            System.out.println(str.charAt(index));
    
        } 
 
}
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter the index: ");
		int num = sc.nextInt();
		
		Index(str,num);
		
	}

}
