/*
The School of Languages and Science teaches five subjects : Physics, Chemistry, Math, Botany and Zoology. 
Each student is skilled in one subject. The subjects are described by string of named skills that consists of 
the letters p,c,m,b, and z only. Each character describes the skill of a student  as follows: 


p-> Physics 
c-> Chemistry
m -> Math.
b -> Botany.
z -> Zoology. 

Your task is to determine the total number of different  teams satisfying the following constraints : 


--> A team consists of a group of exactly five students 
--> Each student is skilled in a different subject.
-->  A student may only be on one team.


For instance, if the skills string is "pcmbzpcmbz" then there are two possible teams that can be formed at one time: skills[0-4] and skills[5-9]
determine permutations as we will always be limited to two teams given 10 students 


Function Description 
Complete the function differentTeam in the editor below.  The function must return an integer value representing the number of teams that can be formed with the given constraints 


differentTeams has the following parameters:

skills : a string where each position represents the skill of a student


input = pcmpp
output = 0

Explanantion 
The students skills are described as follows 

1. The first student is skilled in Physics.
2. The second student is skilled in Chemistry
3. The third student is skilled in Math
4. The fourth student is skilled in Physics 
5. The fifth student is skilled in Physics


There are no students skilled in Botany or Zoology, it is impossible to form any team so the function returns 0. 
*/
import java.util.*;
class q1{
    static HashMap <Character,Integer> hm=new HashMap<>();
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        hm.put('p',0);
        hm.put('c',0);
        hm.put('m',0);
        hm.put('b',0);
        hm.put('z',0);
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),(int)hm.get(s.charAt(i))+1);
        }
        int count=0;
        
        while(true){
            if((int)hm.get('p')>0 && (int)hm.get('c')>0 && (int)hm.get('m')>0 && (int)hm.get('b')>0 
            && (int)hm.get('z')>0){
                hm.put('p',(int)hm.get('p')-1);
                hm.put('c',(int)hm.get('c')-1);
                hm.put('m',(int)hm.get('m')-1);
                hm.put('b',(int)hm.get('b')-1);
                hm.put('z',(int)hm.get('z')-1);
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
