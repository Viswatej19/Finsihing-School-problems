/*
Shyam is given a group of N batteries with some voltages[], 
the voltage can be '+ve' or '-ve',
Shyam needs to setup a particular voltage V.

His task is to check if the sum of voltages of contiguous subset of batteries is equal to the required voltage V 
and the batteries in the subset should be maximum in count. 

If such subset is found print the count of batteries in it.
Otherwise, print 0.

Input Format:
-------------
Line-1 : Two integers N and V, number of batteries and required voltage.
Line-2 : N space separated integers, voltages of N batteries.

Output Format:
--------------
Print an integer, maximum count of batteries in a contiguous subset 
whose voltages sum is equal to V.


Sample Input-1:
---------------
5 3
2 -2 7 -4 3

Sample Output-1:
----------------
4

Explanation:
--------------
The sum of contiguous subset of batteries with volates: [2, -2, 7, -4] is equals 3.
and it is the maximum.

Sample Input-2:
---------------
4 2
-5 -3 5 3

Sample Output-2:
----------------
2

Explanation: 
------------
The sum of contiguous subset of batteries with volates: [-3, 5] is equals 2.
and it is the maximum.



*/
import java.util.*;
class test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int V = sc.nextInt();
        int max = 0;
        int arr[] = new int[N];
        for(int i=0;i<N;i++)
            arr[i] = sc.nextInt();
        for(int i=0;i<N;i++)
        {
            for(int j=i;j<N;j++)
            {
                int t=0,count=0;
                for(int k=i;k<=j;k++)
                {
                    t=t+arr[k];
                    count++;
                }
                if(t==V)
                {
                    if(max<count) max=count;
                }
            }
        }
        System.out.println(max);
    }
}
