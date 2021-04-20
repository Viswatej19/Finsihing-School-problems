/*
Mounika is creating the binary strings using P 1's and Q 0's.
A binary string contains only 0's and 1's.
She has given a list of binary strings binStr[] to be formed.

Her task is to find, the maximum number of binary strings can be formed, 
with given P 1's and Q 0's only. She cannot use any more 1's or 0's.

Input Format:
-------------
Line-1 -> A single line of space separated binary strings, binStr[].
Line-2 -> Two integers P and Q, P number of 1's and Q number of 0's


Output Format:
--------------
Print an integer as output, maximum number of binary strings can be formed.


Sample Input-1:
---------------
10 0001 111001 1 0
3 5

Sample Output-1:
----------------
4

Explanation:
------------
She can form 4 strings by the using of 3 1's and 5 0's
strings are 10, 0001, 1, 0.


Sample Input-2:
---------------
10 1 0
1 1

Sample Output-2:
----------------
2

Explanation:
------------
She can form 2 strings by the using of 1 1's and 1 0's
strings are 1, 0.

*/
import java.util.*;
class test
{
    static void bubblesort(String[] arr)
    {
        int n = arr.length;
        String temp = "";
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<(n-i);j++)
            {
                if(arr[j-1].length() > arr[j].length())
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int p = sc.nextInt();
        int q = sc.nextInt();
        HashMap<Character,Integer>hm = new HashMap<>();
        hm.put('p',p);
        hm.put('q',q);
        int count=0;
        String a[] = str.split(" ");
        bubblesort(a);
        for(int i=0;i<a.length;i++)
        {
            int tp=(int)hm.get('p');
            int tq=(int)hm.get('q');
            for(int j=0;j<a[i].length();j++)
            {
                if(a[i].charAt(j)=='1')
                {
                    hm.put('p',hm.get('p')-1);
                }
                else if(a[i].charAt(j)=='0')
                {
                    hm.put('q',hm.get('q')-1);
                }
            }
            if((int)hm.get('p')>=0 && (int)hm.get('q')>=0)
            count++;
            else
            {
                hm.put('p',tp);
                hm.put('q',tq);
            }
        }
        System.out.println(count);
    }
}
