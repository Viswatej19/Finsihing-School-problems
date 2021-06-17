/*

Ramu is given a magical string which consits of only (1/2). 

A magical string S consists of only '1' and '2' and obeys the following rules:

The string S is magical because concatenating the number of contiguous occurrences of characters '1' and '2' generates the string S itself.
The first few elements of string S is the following: S = "1221121221221121122......"

If we group the consecutive '1's and '2's in S, it will be:
1 22 11 2 1 22 1 22 11 2 11 22 ......

and the occurrences of '1's or '2's in each group are:
1 2 2 1 1 2 1 2 2 1 2 2 ......

You can see that the occurrence sequence above is the S itself.

Ramu is given an integer N as input and he has to return the number of '1's in the first N number in the magical string S.

Example 1:

Input = 6
Output = 3

Explanation: The first 6 elements of magical string S is "12211" and it contains three 1's, so return 3.
*/
/*import java.util.*;
class test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[]{1,2,2,1,1,2,1,2,2,1,2,2,1,1,2,1,1,2,2};
        int count=0;
        for(int i=0;i<n && i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}*/
import java.util.*;
class test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder sb1=new StringBuilder("122");
        StringBuilder sb2=new StringBuilder("12");
        int count=0;
        int index=2;
        while(index<n-1)
        {
            sb2.append(sb1.charAt(index));
            if(sb2.charAt(index)=='2')
            {
                if(sb1.charAt(sb1.length()-1)=='2')
                {
                    sb1.append("11");
                }
                else
                {
                    sb1.append("22");
                }
            }
            else
            {
                if(sb1.charAt(sb1.length()-1)=='1')
                {
                    sb1.append("2");
                }
                else
                {
                    sb1.append("1");
                }
            }
            index++;
        }
        String str=sb1.toString();
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)=='1')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
