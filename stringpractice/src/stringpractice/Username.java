package stringpractice;

import java.util.Scanner;

public class Username {
	public static String fetchUsername(String mail) {
 
		StringBuilder ans = new StringBuilder();
		int i=0;
		while (i < mail.length() && mail.charAt(i) != '@') {
            ans.append(mail.charAt(i));
            i++;
        }
        return ans.toString();
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mail id");
		String mail = sc.next();
		String result = fetchUsername(mail);
		System.out.println(result);
 
	}
 
}

