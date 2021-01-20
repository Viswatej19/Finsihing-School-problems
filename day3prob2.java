/*
 Scott is a sweet lover and eats sweets daily. His father is worried about his health 
and gives a task to Scott. If Scott solves the task then he is allowed to eat the sweets.

His task is as follows

Scott is given a word 'W'. Now he is supposed to see, the word is a Balanced Word or Not .

A word is said to be Balanced word if it contains all characters same number of times. 
He can also make the word Balanced by removing  only one occurence of a character at any index in the word. 

If he is able to do so print "true" else print "false"


Sample Test Case-1

input = xyz
output = true

This is Balanced because (x-1,y-1,z-1)

Sample Test Case-2

input = xyzz
output = true

This is Balanced because (x-1,y-1,z-2)
He can remove one occurence of z, It results in (x-1,y-1,z-1)

Sample Test Case-3

input = xxyyzzzz
output = false

This is not Balanced because (x-2,y-2,z-4)
By removing once occurence of z, It results in (x-2,y-2,z-3)
So this is not Balanced

Sample Test Case-4

input = xzxyzxz
output = true

This is Balanced because (x-3,y-1,z-3)
By removing once occurence of y, It results in (x-3,z-3)
So this is  Balanced

*/

import java.util.*;
    class prog2{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            String s=sc.next();
            HashMap <Character,Integer> h=new HashMap <Character,Integer>();
            for(int i=0;i<s.length();i++){
                h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
            }
            int a[]=new int[h.size()];
            ArrayList <Integer> al=new ArrayList <Integer>();
            int index=0,count=0;
             int min=Integer.MAX_VALUE;
            for(Map.Entry e:h.entrySet()){
                al.add((int)e.getValue());
                if((int)e.getValue()<=min){
                min=(int)e.getValue();
                }
            }
            boolean flag=true;
            int c=1,f=0;
            for(Integer x:al){
                if(min==1 && (int)x==min){
                    count++;
                }
            }
            
           if(count==1){
               al.remove(new Integer(1));
               if(al.size()==1){
                   System.out.println("true");
                   System.exit(0);
               }
               else if(al.size()>1){
               for(int i=0;i<al.size()-1;i++){
                  if(al.get(i)==al.get(i+1) && c>=0 && f<=1){
                      continue;
                  }
                  else if(al.get(i)!=al.get(i+1) && al.get(i)>al.get(i+1) && c>0){
                      al.set(i,al.get(i)-c);
                      c--;
                      f++;
                      i--;
                  }
                  else if(al.get(i)!=al.get(i+1) && al.get(i)<al.get(i+1) && c>0){
                      al.set(i+1,al.get(i+1)-c);
                      c--;
                      f++;
                      i--;
                  }
   
                  else{
                      flag=false;
                      System.out.println(flag);
                      System.exit(1);
                  }
               }
               }
           }
           
            else if(count!=1){
                for(int i=0;i<al.size()-1;i++){
                  if(al.get(i)==al.get(i+1) && c>=0 && f<=1){
                     // System.out.println(" in equ get(i) is "+al.get(i)+" get(i+1) is "+al.get(i+1)+" i is "+i);
                      continue;
                  }
                  else if(al.get(i)!=al.get(i+1) && al.get(i)>al.get(i+1) && c>0){
                     // System.out.println("get(i) is "+al.get(i)+" get(i+1) is "+al.get(i+1));
                      al.set(i,al.get(i)-c);
                      c--;
                      f++;
                      i--;
                  }
                  else if(al.get(i)!=al.get(i+1) && al.get(i)<al.get(i+1) && c>0){
                      //System.out.println("get(i) is "+al.get(i)+" get(i+1) is "+al.get(i+1));
                      al.set(i+1,al.get(i+1)-c);
                      c--;
                      f++;
                      i--;
                  }
                  else{
                      
                     // System.out.println("iam here");
                      flag=false;
                      System.out.println(flag);
                      System.exit(2);
                  }
               }
            }
            System.out.println("true");
        }
    }
