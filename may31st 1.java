/*
Ramu is given two words(a,b) of same size 

he has to select an index and  break the word at the same index for both the words 

breaking a into two words : a1 and a2 where a = a1 + a2 , 
and breaking b into two words: b1 and b2 where b = b1 + b2 . 

Check if a1 + b2 or b1 + a2 forms a palindrome.

When you break a word s into s1 and s2 , either s1 or s2 is allowed to be empty. 

For example, if s ="abc" , then "" + "abc" , "a" + "bc" , "ab" + "c" , and "abc" + "" are valid breaks.

Return true if it is possible to form a palindrome word, otherwise return false .

Notice that x + y denotes the concatenation of words x and y .


Input: a = "x", b = "y"
Output: true

Explaination: If either a or b are palindromes the answer is true since you can break in the following way:

a = "", a = "x"
b = "", b = "y"
Then, a + b = "" + "y" = "y", which is a palindrome.



Input: a = "abdef", b = "fecab"
Output: true



Input: a = "ulacfd", b = "jizalu"
Output: true
Explaination: break them at index 3:


a1 = "ula", a2 = "cfd"
b1 = "jiz", b2 = "alu"
Then, a1 + b2 = "ula" + "alu" = "ulaalu", which is a palindrome.
*/
import java.util.*;
class test{
    public static boolean check(String str)
    {
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        if(str.equals(sb.toString()))
            return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        boolean ans=false;
        if(check(s1))
            ans=true;
        else if(check(s2))
            ans=true;
        else{
            for(int i=0;i<s1.length();i++)
            {
                String a=s1.substring(0,i+1);
                String b=s1.substring(i+1);
                String c=s2.substring(0,i+1);
                String d=s2.substring(i+1);
                if(check(a+d)||check(b+c))
                {
                        ans=true;
                        break;
                }
            }
        }
        System.out.println(ans);
    }
}
