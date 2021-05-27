/*
Prasad is working on patterns.
He is given a pattern P of length N-1, He needs to construct a list L[] of length N.

And the list L[] has to construct using the integers from 1 to N only.

To construct the list, He defined a rule set as follows based on the pattern P:
	- if P[i] == 'A', then L[i] < L[i+1].
	- if P[i] == 'D', then L[i] > L[i+1].
	- And the L[] should be lexicographically smallest.

You will be given the pattern P of length N-1 
Your task is to construct the list using the pattern and 
according to the rules set by Prasad


Input Format:
-------------
A string, the pattern consist of only A and D alphabets.

Output Format:
--------------
Print the list, according to the given pattern.


Sample Input-1:
---------------
DAA

Sample Output-1:
----------------
[2, 1, 3, 4]

Explanation:
------------
Using the sequence DAA there are more than one way of creating the list:
for example: [2,1,3,4], [3,1,2,4], [4,1,2,3].
According to the given info, the result should be lexicographically smallest.
So the answer is [2,1,3,4].


Sample Input-2:
---------------
ADA

Sample Output-2:
----------------
[1, 3, 2, 4]

Explanation:
------------
Using the sequence ADA there are more than one way of creating the list:
for example: [1,3,2,4], [1,4,2,3], [2,4,1,3], [2,3,1,4]..etc
According to the given info, the result should be lexicographically smallest.
So the answer is [1,3,2,4].

*/
import java.util.*;
class test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int min=1;
        int a[] = new int[s.length()+1];
        int i=0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='A')
            {
                a[i]=min++;
                for(int j=i-1;j>=0;j--){
                    if(s.charAt(j)=='A')
                    break;
                    else
                    a[j]=min++;
                }
            }
        }
        a[i]=min;
        System.out.println(Arrays.toString(a));
    }
}
