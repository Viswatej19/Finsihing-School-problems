
/*
Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

Example 1:

Input: n = 12
Output: 3 
Explanation: 12 = 4 + 4 + 4.

Example 2:

Input: n = 13
Output: 2
Explanation: 13 = 4 + 9.
*/
import java.util.*;
class test
{
    public static int minsq(int n)
    {
        if(n<=3)
        {
            return n;
        }
        int num = n;
        for(int i=1;i<=n;i++)
        {
            int square = i*i;
            if(square>n)
            {
                break;
            }
            else
            {
                num = Math.min(1+minsq(n-square),num);
            }
        }
        return num;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(minsq(n));
    }
}
