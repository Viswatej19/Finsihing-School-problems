/*

Cardano is a famous mathematician. working on numbers.
Given a number N, which is the product of all the digits of a number.
You need to find such smallest number S.

Your task is to help Mr Cardano to find smallest number S, 
where the product of all the digits of S should be equal to N.
If it is not possible to create S with in range of integer, print 0.


Input Format:
-------------
An integer N

Output Format:
--------------
Print an integer, smallest number S.


Sample Input-1:
---------------
36

Sample Output-1:
----------------
49


Sample Input-2:
---------------
147

Sample Output-2:
----------------
377


Sample Input-3:
---------------
22

Sample Output-3:
----------------
0
*/
import java.util.*;
class test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack <Integer> stack = new Stack();
        if(N>=0 && N<=9)
        {
            System.out.println("0");
        }
        for(int i=9;i>=2&&N>1;i--)
        {
            while(N%i==0)
            {
                stack.push(i);
                N=N/i;
            }
        }
        if(N!=1)
            System.out.println("0");
        int k = 0;
        while(!stack.empty())
        {
            k = k * 10 + stack.peek();
            stack.pop();
        }
        System.out.println(k);
    }
}
