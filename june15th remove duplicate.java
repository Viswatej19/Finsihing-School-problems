/*
Ramu is given a string s, Now he has to remove duplicate letters 
so that every letter appears once and only once.

He must make sure that the result produces should occur in the order given in string 

Example 1:

Input = bcabc
Output = bca
*/
import java.util.*;
class test{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch[] = str.toCharArray();
        int index=0;
        for(int i=0;i<ch.length;i++){
            int j;
            for(j=0;j<i;j++){
                if(ch[i]==ch[j]){
                    break;
                }
            }
            if(j==i){
                ch[index++] = ch[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(ch,index)));
    }
}
