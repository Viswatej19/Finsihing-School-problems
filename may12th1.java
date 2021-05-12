/*
Given an array of integers, find the most occurring element of the array and return any one of its indexes randomly with equal probability.

if no duplicate elements found print -1.
Examples:


input =15
-1 4 9 7 7 2 7 3 0 9 6 5 7 8 9
output =
3 4 6 12

  
Element with maximum frequency present at index 6
Element with maximum frequency present at Index 3
Element with maximum frequency present at index 4
Element with maximum frequency present at index 12

All outputs above have equal probability.print index increasing order.

For all boundary conditions print -1 

*/
import java.util.*;
class test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> hm=new HashMap();
        for(int i=0;i<n;i++){
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        int key=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer>k:hm.entrySet()){
                if(k.getValue()>max)
                {
                    max=k.getValue();
                    key=k.getKey();
                }
            }
            if(max==1)
                System.out.println("-1");
            else{
                for(int i=0;i<a.length;i++)
                {
                    if(a[i]==key){
                        System.out.print(i+" ");
                    }
                }
            }
    }
}
