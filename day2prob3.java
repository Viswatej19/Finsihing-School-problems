/*
ramu is given a task to print the numbers n in vertical fashion in a snake model

input = 5
output = 
1
2 9
3 8 10
4 7 11 14
5 6 12 13 15

input = 4
output = 
1
2 7
3 6 8
4 5 9 10

*/
import java.util.*;
class prog3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0,count=n,inc=1;
        boolean temp=true;
        String a[][]=new String[n][n];
        for(int i=0;i< n;i++){
            for(int j=0;j<n;j++){
                a[i][j]="";
            }
        }
        for(int i=0;i<n;i++){
            if(temp){
                for(int j=x;j<count;j++){
                    a[j][i]=String.valueOf(inc++);
                }
                temp=false;
            x++;
            continue;
            }
            else if(!temp){
                for(int j=count-1;j>=x;j--){
                    a[j][i]=String.valueOf(inc++);
                }
                temp=true;
            x++;
            continue;
            }
        }
        for(int i=0;i< n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
