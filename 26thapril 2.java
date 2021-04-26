/*
Given a string s, return the first non-repeating character in it and return its index. If it does not exist, return -1.

 
Example 1:

Input: s = "hello"
Output: 0

Example 2:

Input: s = "ississipi"
Output: 7

Example 3:

Input: s = "aabb"
Output: -1

*/
import java.util.*;
class q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        LinkedHashMap <Character,Integer> hm=new LinkedHashMap <>();
        String s=sc.next();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry e:hm.entrySet()){
            
            if((int)e.getValue()==1){
                System.out.println(s.indexOf(String.valueOf((char)e.getKey())));
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}
