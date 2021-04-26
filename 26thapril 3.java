/*
Write a program to print the following pattern 


input = 5
output = 
1 2 3 4 5
15 14 13 12
6 7 8
11 10
9


input = 6
output = 
21 20 19 18 17 16
1 2 3 4 5
15 14 13 12
6 7 8
11 10
9

input = 7
output = 
1 2 3 4 5 6 7
28 27 26 25 24 23
8 9 10 11 12
22 21 20 19
13 14 15
18 17
16



input = 8
output = 
36 35 34 33 32 31 30 29
1 2 3 4 5 6 7
28 27 26 25 24 23
8 9 10 11 12
22 21 20 19
13 14 15
18 17
16
*/
import java.util.*;
class q1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int l1=1;
        int l2=0;
        for(int i=r;i>0;i--){
           
                    l2=l2+i;
                
        }
        for(int i=r;i>0;i--){
            for(int j=0;j<i;j++){
                if(i%2==0){
                    System.out.print((l2--)+" ");
                }
                else{
                    System.out.print((l1++)+" ");
                }
            }
            System.out.println();
        }
    }
}
