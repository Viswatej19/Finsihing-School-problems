/*
There is a road in a hill area, the road is flat in some places and slope 
in some places (only upwards). There are N lamp posts are fixed on one side 
of the road. The lights on the lamp posts are arranged in horizontal line, 
for making this arrangement, the lamp post are made with different heights.

You will be given the heights of the lamp posts from top of the hill to 
the bottom of the hill. And you will be given an height H, your task is to find 
the starting and ending position of the lamp posts with height H. 
If there is no such lamp post with height H, return [-1, -1].

Complete your code with O(log n) runtime complexity.

Input Format:
-------------
Line-1 -> Two space separated integers N and H, number of lamp posts and height H.
Line-2 -> N space separated integers, heights of the lamp posts.

Output Format:
--------------
Print two integers set, starting and ending positions of the lamp posts with height H.


Sample Input-1:
---------------
10 5
2 3 3 5 5 5 8 9 9 9

Sample Output-1:
----------------
[3, 5]


Sample Input-2:
---------------
10 6
2 3 3 5 5 5 8 9 9 9

Sample Output-2:
----------------
[-1, -1]
*/
import java.util.*;
class test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int a[]=new int[n];
        int first=-1;
        int last=-1;
        int count=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]<=h&&a[i]==h)
            {
                count++;
                if(count==1)
                {
                    first=i;
                    last=i;
                }
                else
                {
                    last=i;
                }
            }
        }
        if(count==0){
            first=-1;
            last=-1;
        }
        System.out.println("["+first+", "+last+"]");
    }
}
