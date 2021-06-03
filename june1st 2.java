/*
Ramu is given few characters 
Now his maths teacher taught the permutations and asked to print all possible permutations in alphabetical order 



input =
abc
output =
abc
acb
bac
bca
cab
cba
*/
import java.util.*;
public class test{
	static void Permut(String str,String ans)
	{
		if (str.length() == 0){
			System.out.print(ans);
			return;
		}
		for (int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			String ex = str.substring(0, i) + str.substring(i + 1);
			Permut(ex,ans + ch);
		}
	}
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
		Permut(s," ");
	}
}
