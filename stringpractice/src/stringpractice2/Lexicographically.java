package stringpractice2;

import java.util.Scanner;

public class Lexicographically {



public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	System.out.println("enter s1");
	String s1= scn.nextLine();
	System.out.println("enter s2");
	String s2= scn.nextLine();
	
	int s=s1.compareTo(s2);
	
	 if(s<0) {
		 System.out.println(s1 +" comes before " +s2);
	 }else if(s>0) {
		 System.out.println(s2 +" comes before " +s1);
	 }else  {
		 System.out.println(s1 +" and " +s2 +"are equal");
	 }
		
	}
}