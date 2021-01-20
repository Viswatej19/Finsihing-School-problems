/*
Given an expression in string format print the value of the expression after evaluating 

Rules for Evaluation :
The expression is Evaluated from Left to Right and operators allowed are only +,-,/,*
Ignore Operator Precedence
Assume the expression only consists of numbers(0-9)(both postive and negative) and 
operators(+,-,*,/)

Test Case-1
input = 2+3*6
output = 30

Explanation :- The sum of 2+3 is 5 and 5*6 = 30 


Test Case-2
input = 5+7-9+0*0+1
output = 1

Explanation - The sum of 5+7 is 12 
12-9 is 3 and 3+0 is 3, 3*0 is 0 and 0+1 is 1 


Test Case-3
input = -1+-1*2
output = -4

Explanation -
-1 + -1 is -2 
and -2 * 2 is -4

*/

import java.util.*;
    class q1{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            ArrayList <String> al=new ArrayList <String> ();
            String s=sc.next();
            int sol=0;
            int p=-1;
            char c[]=new char[]{'+','-','*','/'};
            int x=0,nf=0;
            StringBuilder sb=new StringBuilder();
            while(x<s.length()){
            for(int i=x;i<s.length();i++){
                if(al.size()>=3 || i==s.length()){
                    break;
                }
                if(Character.isDigit(s.charAt(i))){
                    if(nf==0){
                    al.add(String.valueOf(s.charAt(i)));
                
                    }
                    else if(nf==1){
                        sb.append(s.charAt(i));
                        nf=0;
                        al.add(sb.toString());
                        sb=new StringBuilder();
                        
                    }
                }
                else if(new String(c).contains(String.valueOf(s.charAt(i)))){
                    if((s.charAt(i)=='-' && al.size()==0) || (s.charAt(i)=='-' && new String(c).contains(al.get(al.size()-1))) || (s.charAt(i)=='-' && al.size()==0)){
                        sb.append('-');
                        nf=1;
                        continue;
                    }
                    else{
                    al.add(String.valueOf(s.charAt(i)));
                    
                    }
                }
                //System.out.println("value of i is "+ i +" al size is "+al.size());
                p=i;
            }
           // System.out.println(al + " value of p is " + p);
            if(al.size()==3 || x==s.length()){
                //System.out.println("iam here");
                String a=al.get(0);
                String b=al.get(2);
                String j=al.get(1);
                switch(j){
                    case "+":sol=Integer.parseInt(a)+Integer.parseInt(b);
                    break;
                    case "*":sol=(int)Integer.valueOf(a)*(int)Integer.valueOf(b);
                    break;
                    case "-":sol=Integer.parseInt(a)-Integer.parseInt(b);
                    break;
                    case "/":sol=Integer.parseInt(a)/Integer.parseInt(b);
                    break;
                }
               al.clear();
                //System.out.println(al);
                al.add(String.valueOf(sol));
                x=p+1;
            }
            }
            System.out.println(sol);
        }
    }
