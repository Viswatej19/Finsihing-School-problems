/*
Ramu has given a task to break his friends code 
he will given all lower case alphabets  and code as the input 
Ramu has to figure the text from the code and display the text 

Input - The first line of input consists of lower case alphabets 
and code 

The first alphabet letter will given 01, second alphabet will be given 02, and so on 

Output - Break the code and display the string 


Sample Test Case - 1 
input =abcdefghijklmnopqrstuvwxyz
110525
output = key


Explantion - 
From the above test case we have 'a' has '01', 'b' has '02', and finally 'z' has '26' 
where each alphabet will be assigned a two digit number 
and for the code 110525 the characters will be 11 as 'k', 05 as 'e' and 25 as 'y' 
so the output is "key" 

Sample Test Case - 2
input =
qpwoeirutyalskdjfhgzmxncbv
131013090521
output = system


Explantion - From the above test case we have 'q' as '01' , 'p' as '02' and finally 'v' as '26'
and for the code 131013090521 we have the following code 
13-s
10-y
13-s
09-t
05-e
21-m

so the output is system

*/
import java.util.*;
class prog2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        HashMap <String,Character> hm=new HashMap <String,Character>();
        for(int i=0;i<s1.length();i++){
            if(i<9){
                StringBuilder sb=new StringBuilder();
                sb.append("0"+String.valueOf(i+1));
                hm.put(sb.toString(),s1.charAt(i));
            }
            else{
                hm.put(String.valueOf(i+1),s1.charAt(i));
            }
        }
        StringBuilder sb1=new StringBuilder();
        
        for(int i=0;i<s2.length()-1;i++){
            StringBuilder sb2=new StringBuilder(s2.substring(i,i+2));
            sb1.append(hm.get(sb2.toString()));
            i++;
        }
        System.out.println(sb1.toString());
    }
}
