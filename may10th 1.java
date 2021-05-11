/*
Ramu is given some rows and columns of numbers which contain 
only '1' and '0'. Now his madam gave him a task to find the square 
in the given matrix which contains only's 1 and he has to return the area 


Input 
5 5
1 0 1 0 0
1 0 1 1 1
1 1 1 1 1
1 0 0 1 0
output = 4


Explanation 

The Second row third column froms the square matrix whose area is 4

Input 
3 4
1 1 1 0
1 1 1 0
1 1 1 0
output = 9 


*/

import java.util.*;
class o{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int matrix[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                matrix[i][j]=sc.nextInt();
        }
        int max1=Integer.MIN_VALUE;
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(matrix[i][j]==1){
                    matrix[i][j]=Math.min(matrix[i][j-1],Math.min(matrix[i-1][j],matrix[i-1][j-1]));
                    matrix[i][j]=matrix[i][j]+1;
                }
                max1=Math.max(max1,matrix[i][j]);
            }
        }
        System.out.println(max1*max1);
    }
}
