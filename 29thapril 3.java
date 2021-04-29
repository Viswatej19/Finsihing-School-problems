/*
Given an array of orginal grades of students print upgraded grades based on the following rules.

i) every student receives a grade in the inclusive range from 0 to 100

ii) any grade is less than 40 is failing grade

iii) if the difference between the grade and the next multiple of 5 is less than 3, then round the original grade to the next multiple of 5.

iV) if the value of grade is less than 38, no rounding occurs as the result will still be failing grade


input =
4
73
67
38
33
output =
75
67
40
33

Explanation
73 becomes 75 because round to 75 and it is multiple of 5
67 becomes 67 because next multiple of 5 is 70 but difference between new grade and old grade is not less than 3 so dont update this.
38 becomes 40 above reasons
33 is <38 so will not change
*/
import java.util.*;
class test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt(); 
        }
        for(int i=0;i<n;i++)
        {
        if(arr[i]<38)
        {
            System.out.println(arr[i]);
        }
        else if((arr[i]+2)%5==0 || (arr[i]+1)%5==0)
        {
            if((arr[i]+2)%5==0)
            {
                System.out.println(arr[i]+2);
            }
            else
            {
                System.out.println(arr[i]+1);
            }
        }
        else
            {
                System.out.println(arr[i]);
            }
        }
    }
}
