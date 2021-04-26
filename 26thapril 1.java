/*
Ramu is given a number in string format. 
Now he turns his head by 180 and checks the given string. 
He saw the number that looks the same when rotated 180 defrees(looked at upside down). 

Help him to write the code and print the result as true or false. 

If same print true else print false 


Example 1:

Input: num = "69"
Output: true

Example 2:

Input: num = "88"
Output: true

Example 3:

Input: num = "962"
Output: false

Example 4:

Input: num = "1"
Output: true

*/
import java.util.*;
class q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap <Character,Character> hm=new HashMap <>();
        hm.put('1','1');
        hm.put('0','0');
        hm.put('6','9');
        hm.put('8','8');
        hm.put('9','6');
        StringBuilder sb=new StringBuilder(); 
        for(int i=s.length()-1;i>=0;i--){
            if(hm.containsKey(s.charAt(i))){
                    sb.append(hm.get(s.charAt(i)));
            }else{
                System.out.println("false");
                System.exit(0);
            }
        }
        System.out.println((sb.toString().equals(s))?true:false);
            
        
    }
}
