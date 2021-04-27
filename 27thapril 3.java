/*
You are given a string allowed consisting of distinct characters and an array of strings words.

A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.

If it not appears then print 0

Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.

Example 2:

Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.

The first line of input contains the array of words followed by "allowed" word  

*/
import java.util.*;
class test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String pakka=sc.next();
        String str[]=s.split(" ");
        HashMap <Character,Boolean> hm=new HashMap <>();
        for(int i=0;i<pakka.length();i++)
        {
            hm.put(pakka.charAt(i),true);
        }
        int count=0;
        for(int i=0;i<str.length;i++)
        {
            int temp=-1;
            for(int j=0;j<str[i].length();j++)
            {
               if(!hm.containsKey(str[i].charAt(j)))
               {
                   temp=1;
                   break;
               } 
            }
            if(temp==-1)
            count++;
        }
        System.out.println(count);
    }
}
