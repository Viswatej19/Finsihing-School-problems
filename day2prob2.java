/*
Given a string s, return the longest substring in S,
which is a palindrome

for example:
input =abbbabbcbbacdb
output =abbcbba


input =thedivideriswide
output = edivide
*/
import java.util.*;
class prog2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb=new StringBuilder(s);
        ArrayList <String> al=new ArrayList <String>();
        ArrayList <String> p=new ArrayList <String>();

        for(int i=0;i<sb.length();i++){

            for(int j=i+1;j<sb.length()+1;j++){
                StringBuilder str=new StringBuilder();
                str.append(sb.substring(i,j));
                al.add(str.toString());
            }
        }
        for(String x:al){
            int f=1;
            for(int i = 0; i < x.length()/2; i++){
                if(x.charAt(i)!=x.charAt(x.length()-i-1)){
                    f=0;
                    break;
                }
            }
            if(f==1){
                p.add(x);
            }
        }
        int max=0,ind=-1;
        for(int i=0;i<p.size();i++){
            if(p.get(i).length()>max){
                max=p.get(i).length();
                ind=i;
            }
        }
        System.out.println(p.get(ind));
    }
}
