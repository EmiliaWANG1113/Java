package codegym;

import java.lang.Math;
import java.util.Arrays;
public class string {
		
	public static void main(String args[]) {
		
		String str = "id, name, age";
		String[] sArray = str.split(",");
		
		System.out.println(sArray[1].trim());
		
		
		String str1 = "abcdef";
		System.out.println(str1.substring(0,4));
		
	}
	
}
