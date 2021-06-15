/*
Ramu is given an array of numbers now he has to check for a super square matrix in the given array.

A super square matrix is a matrix such that every row sum, every column sum, and both
diagonal sums are all equal. 

The integers in the magic square do not have to be distinct. 
Every 1 x 1 grid is trivially a super square matrix 

Given an m x n integer grid , return the size (i.e., the side length k ) of the largest super square matrix that can be found
within this grid.



Example 1:

Input = 
4 5
7 1 4 5 6
2 5 1 6 4
1 5 4 3 2
1 2 7 3 4
Output: 3

Explanation: 

From the above array we have the following super square matrix of size 3 
5 1 6 
5 4 3
2 7 3 



The largest super square matrix has a size of 3.
Every row sum, column sum, and diagonal sum of this magic square is equal to 12.
- Row sums: 5+1+6 = 5+4+3 = 2+7+3 = 12
- Column sums: 5+5+2 = 1+4+7 = 6+3+3 = 12
- Diagonal sums: 5+4+3 = 6+4+2 = 12
*/
import java.util.*;
class q1{
    public static boolean fun(int[][] a,int p,int q,int k){
        int i,j;
        int sum=0;
        for(j=q;j<q+k;j++){
            sum+=a[p][j];
        }
        for(i=p+1;i<p+k;i++){
            int sum1=0;
            for(j=q;j<q+k;j++){
                sum1+=a[i][j];
            }
            if(sum1!=sum){
                return false;
            }
        }
        for(j=q;j<q+k;j++){
            int sum1=0;
            for(i=p;i<p+k;i++){
                sum1+=a[i][j];
            }
            if(sum1!=sum){
                return false;
            }
        }
        int d=p-q;
        int sum1=0;
        for(i=p;i<p+k;i++){
            for(j=q;j<q+k;j++){
                if(i-j==d){
                    sum1+=a[i][j];
                }
            }
        }
        if(sum1!=sum){
            return false;
        }
        j=q+k-1;
        sum1=0;
        for(i=p;i<p+k;i++){
            sum1+=a[p][j];
            j-=1;
        }
        if(sum1!=sum){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int i,j;
        int[][] a=new int[r][c];
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int start=Math.min(r,c);
        int f=0;
        for(int k=start;k>1;k--){
            for(i=0;i<=r-k;i++){
                for(j=0;j<=c-k;j++){
                    if(fun(a,i,j,k)){
                        System.out.println(k);
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println(1);
    }
}
