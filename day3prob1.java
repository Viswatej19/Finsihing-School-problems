/*
Program-1 

Tanu and Manu are playing a Rangoli Game with "#", as part of the game 
Tanu has to read a group of words and double every consonant and 
place an "#" in between them . 



Sample Test Case-1
input = this is fun
output = t#th#his#s is#s f#fun#n

Explanation 
t is consonant then double the consonant and place "#" in between, 
So it becomes "t#t" and do this for full string

Sample Test Case-2
input =hello
output = h#hel#ll#lo

Explanation 
h is consonant then double the consonant and place "#" in between, 
so it become "h#h" and e is vowel so no change for it and  same for the remaining characters 

*/
import java.util.*;
class prog1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=new char[]{'a','e','i','o','u','A','E','I','O','U'};
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if ((new String(ch).contains(String.valueOf(s.charAt(i)))) || s.charAt(i)==' '){
                sb.append(s.charAt(i));
            }
            else{
                StringBuilder str=new StringBuilder(s.charAt(i)+"#"+s.charAt(i));
                sb.append(str);
            }
        }
        System.out.println(sb.toString());
    }
}
