/*

Given two strings, one is a subsequence if all of the elements of the first string occur in the same order within the second string. 

They do not have to be contiguous of the second string, but order must be maintained. For example, given the string "i like cheese". the words 
"i" and "cheese" are one possible subsequence of that string. 


In this challenge, you will be given two strings s and t where t is a subsequence of s, report the words of s, missing in t(case sensitive), in the order they are missing the earlier

example, if s = i like cheese and t = like, then like is the longest subsequence and [i,cheese] is the list of missing 
words in order. 


Function Description 
Complete the function missingWords in the editor below. It must return an array of strings containing any words in s that are missing  from t  in the order they occur

missingWords has the following parameters 
s- a sentence of space separated words
t- a senetence of space seprarated words 


Constraints 
Strings s and t consist of English alphabteic letters (i.e., a-z and A-Z) and spaces only. 
1 <= [t] <= [s] <= 10^6
1 <= length of any word in s or t <=15
It is guranteed that string t is a subsequence of string s.


Input
I am using HackerRank to improve programming 
am HackerRank to improve 
Output 
I
using 
programming

Explanation -
1.I
2. using
3. programming 
We add these words in order to the array ["I","using","programming"] , then return this array as our answer. 

*/
import java.util.*;
class q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        String a1[]=s.split(" ");
        String a2[]=t.split(" ");
        int j=0,i=0;
        while(j<a2.length){
            if(a2[j].equals(a1[i])){
                j++;
                i++;
                continue;
            }else{
                System.out.println(a1[i]);
                i++;
            }
        }
        while(i<a1.length){
            System.out.println(a1[i]);
            i++;
        }
    }
}
