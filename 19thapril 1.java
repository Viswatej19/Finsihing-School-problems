/*
Somesh is working on Number Strings.
He got an idea to find the smallest possible number by 
deleting some digits from the number without changing 
the relative order of digits in it.

You will be given a integer String 'num', and an integer n.
Find the smallest number possible after deleting n digits from 'num'.

Note: If the number string 'num' turns to empty, print 0.

Input Format:
-------------
Line-1 : A string num, consist of digits only.
Line-2 : An integer n, number of digits to delete.

Output Format:
--------------
Print the smallest possible number.


Sample Input-1:
---------------
1432219
3

Sample Output-1:
----------------
1219

Explanation: 
------------
Delete the three digits 4, 3, and 2 to form the smallest number 1219.

Sample Input-2:
---------------
10200
1

Sample Output-2:
----------------
200

Explanation:
------------
Delete the leading 1 and the smallest number is 200. 
Note that the output must not contain leading zeroes.

*/
import java.util.*;
class q1{
    static int min=Integer.MAX_VALUE;
    public static String deleteof(String s,int n){
        if(n<=0){
           // System.out.println(s);
            if(Integer.parseInt(s)<min){
                       min=Integer.parseInt(s);
                       //System.out.println(min);
            }
            return s;
            
        }
        for(int i=0;i<s.length();i++){
          //  System.out.println("n is "+n);
        StringBuilder sb1=new StringBuilder(s);
                sb1=sb1.deleteCharAt(i);
                String t=deleteof(sb1.toString(),n-1);
            if(Integer.parseInt(t)<min){
                       min=Integer.parseInt(t);
                       System.out.println(min);
            }
            if(i==s.length()-1)
            return String.valueOf(Integer.MAX_VALUE);
        }
        
        return "";
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        for(int i=0;i<s.length();i++){
            
           // System.out.println("i is:"+i);
            StringBuilder sb=new StringBuilder(s);
            sb=sb.deleteCharAt(i);
            
            
            
              //  System.out.println("j is:"+j);
                
                deleteof(sb.toString(),n-1);
        
            
        }
        System.out.println(min);
    }
}
