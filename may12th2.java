/*
Given a sqaure matrix of 2-Dimensional array of n rows and n columns. 
Print this matrix in snake fashion starting from column n-1 
as shown in the figure below.


Sample Input:
3
1 2 3 
4 5 6
7 8 9

Sample Output: 
3 2 1 4 5 6 9 8 7

Explanation:

1<-2<-3 
|
4->5->6
      |
7<-8<-9

*/
import java.util.*;
class test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                matrix[i][j]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(i%2!=0){
                for(int j=0;j<n;j++)
                    System.out.println(matrix[i][j]+" ");
            }
            else{
                for(int j=n-1;j>=0;j--)
                    System.out.println(matrix[i][j]+" ");
            }
        }
    }
}
