package sqlpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sql {
	
	/*
	 * public static void extarctcol(String query) { int len = query.length();
	 * for(int i = 0; i < len; i++) { String[] splitarray = query.split(" ");
	 * 
	 * do { System.out.print("Basic Query Part :" + i); }
	 * 
	 * while((splitarray[i].contains(query))== false); } }
	 * 
	 */

	  	public static void extraction(String input) {
	   
	  		// Extracting columns part
	  		String columnsPart = " ";
	  		if (input.contains("select")) {
	  			int start = input.indexOf("select") + "select".length();
	  			int end = input.indexOf("from");
	  			columnsPart = input.substring(start, end).trim();
	  		}
	  		System.out.println("The coloumns are: " + columnsPart);
	   
	  		// Extracting the conditions
	  		List<String> list = new ArrayList<>();
	  		if (input.contains("where")) {
	  			int start = input.indexOf("where") + "where".length();
	  			String conditions = input.substring(start).trim();
	  			String[] arr = conditions.split("(and|or)");
	  			for (String condition : arr) {
	  				list.add(condition.trim());
	  			}
	  		}
	  	    // Extracting the conditions seperately
	  		String result = list.toString();
	  		System.out.println("The conditions are: " + result);
	  		
	  		
	  		
	  		// Extracting logical operators part
	  		List<String> opList = new ArrayList<>();
	  		String[] logical = { "and", "or" };
	  		for (String op : logical) {
	  			if (input.contains(op))
	  				opList.add(op);
	  		}
	  		System.out.println("The Logical operators are: " + opList.toString());
	  	}
	   
	  	
	   
	  	/*
	  	 * for (int i = 0; i < str.length(); i++) {
	  	 *
	  	 * do { System.out.print("Basic Query Part :" + splittedArray[i]);
	  	 * }while((splittedArray[i].contains(str))== false); }
	  	 */
	  	
	   
	  	public static void main(String[] args) {
	  		// TODO Auto-generated method stub
	  		Scanner scanner = new Scanner(System.in);
	  		System.out.println("Enter the string :");
	  		String input = scanner.nextLine();
	  		extraction(input);
	   
	  	}
	  }
	   
	   
	   