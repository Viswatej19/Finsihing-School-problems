/*
Ananth interested in creating the acronyms for any word.
The definition of acronym is another word with a concatenation of its first letter,
 the number of letters between the first and last letter, and its last letter. 
 
 If a word has only two characters, then it is an acronym of itself.
 
 Examples:
	- Acronym of 'dog' is 'd1g'.
	- Acronym of 'another' is 'a5r'.
	- Acronym of 'ab' is 'ab'.

You are given a list of vocabulary, and another list of words.
Your task is to check is word with the vocabulary and
return "true" if atleast one of the following rules satisfied:
	1. acronym of the word should not match with any of the acronyms of vocabulary
	2. if acronym of the word matches with any of the acronyms of vocabulary
	'the word' and matching words in vocabulary should be same.
Otherwise, return 'false'.

Input Format:
-------------
Line-1: Space separated strings, vocabulary[] 
Line-2: Space separated strings, words[] 

Output Format:
--------------
Print N boolean values, where N = words.length. 


Sample Input-1:
---------------
cool bell cool coir move more mike
cool char move 

Sample Output-1:
----------------
true false false

*/
import java.util.*;
class k
{

    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        String s1[]=s.nextLine().split(" ");
        String s2[]=s.nextLine().split(" ");
        String as1[]=new String [s1.length];
        String as2[]=new String [s2.length];
        String b[]=new String[s2.length];
        for(int i=0;i<s1.length;i++)
        {
            int l=(s1[i].length()-2);
            as1[i]=""+s1[i].charAt(0)+l+s1[i].charAt(s1[i].length()-1);
            
        }
        for(int i=0;i<s2.length;i++)
        {
            int l=(s2[i].length()-2);
            as2[i]=""+s2[i].charAt(0)+l+s2[i].charAt(s2[i].length()-1);
        }
        
        for(int i=0;i<as2.length;i++)
        {
            for(int j=0;j<as1.length;j++)
            {
                if(as2[i].equals(as1[j]) && s2[i].equals(s1[j]))
                {
                    if(b[i]!="false")
                    b[i]="true";
                }
                else if(as2[i].equals(as1[j]) && !s2[i].equals(s1[j]))
                b[i]="false";
                else if(!as2[i].equals(as1[j]))
                {
                    if(b[i]!="false")
                    b[i]="true";
                }
            }
        }
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
