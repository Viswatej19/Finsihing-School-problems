/*
Suraj and Tom are two best friends. 

Both of them have given two Strings S1 and S2 
Suraj has given String S1 and Tom has given String S2
Suraj is always bothered about Tom Strings and checks if's  his string follows sSequence of Tom strings or not 

Help Suraj to solve his problem 

print true if it follows sSequence else print false

A sSequence of  string is a new string which is formed from the original string by removing some (can be none) of the characters without
disturbing the relative positions of the remaining characters. 


Sample Test Case1

input = abc
ahbgdc
output = true


Sample Test Case2
input = aik
appkllli
output = false

Explanation - aik is not a subsequnece of appkllli 


Sample Test Case3

input = axc 
ahbgdc
output = false

Both strings consists only of lowercase characters.

*/

import java.util.*;
class test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int temp=0;
        StringBuilder s=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            for(int j=temp;j<s2.length();j++){
                
                
                if(s1.charAt(i)==s2.charAt(j)){
                    s.append(s1.charAt(i));
                    temp=j+1;
                    break;
                }
                
                if(j==s2.length()-1)
                temp=s2.length();
            }
            if(temp==s2.length())
            break;
            if(s1.length()==s.length())
            break;
        }
        String str=s.toString();
        if(s1.equals(str))
        System.out.println("true");
        else
        System.out.println("false");
    }
}
