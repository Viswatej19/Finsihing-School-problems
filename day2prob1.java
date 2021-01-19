/*
Program1

Ramu and Shyam are playing a game called ReverseGame. 
In this game Shyam wants Ramu to convert the string in the following manner 

Ramu has to only reverse the letters(a-z,A-Z) and other letters remain unchanged


Sample Test Case -1

input = a&b*c$rt
output = t&r*c$ba

Explanation - 

From the above test case we have a,b,c,r,t as the alphabets 
and reversing only this characters without disturbing other characters we will have 
t&r*c$ba as the output

Sample Test Case -2

input = a&b$c#d
output = d&c$b#a

Explanation - 

From the above test case we have a,b,c,d as the alphabets 
and reversing only this characters without disturbing other characters we will have 
d&c$b#a  as the output

*/
import java.util.*;
class prog1 
{ 
	public static void reverse(char str[]) 
	{ 
		int r = str.length - 1, l = 0; 
		while (l < r) 
		{ 
			if (!Character.isAlphabetic(str[l])) 
				l++; 
			else if(!Character.isAlphabetic(str[r])) 
				r--; 
			else
			{ 
				char temp = str[l]; 
				str[l] = str[r]; 
				str[r] = temp; 
				l++; 
				r--; 
			} 
		} 
	} 
	public static void main(String[] args) 
	{ 
	    System.out.print("input = ");
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
		char[] charArray = str.toCharArray(); 
		reverse(charArray);
		String revStr = new String(charArray); 
		System.out.println("output = " + revStr); 
	} 
} 

