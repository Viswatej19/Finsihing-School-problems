/*Apply D&C sort 'n' number of elemnts using mergesort  and read inputs from command propt
 
 
Expected output=
 
Merge Sort Test                                                                                                         
                                                                                                                        
Enter number of integer elements                                                                                        
10                                                                                                                      
                                                                                                                        
Enter 10 integer elements                                                                                               
25                                                                                                                      
63                                                                                                                      
54                                                                                                                      
78                                                                                                                      
98                                                                                                                      
102                                                                                                                     
321                                                                                                                     
69                                                                                                                      
88                                                                                                                      
256                                                                                                                     
                                                                                                                        
Sorted array                                                                                                            
25 54 63 69 78 88 98 102 256 321   
*/
import java.util.*;
class Merge_sort_Ex1
{
void sort(int a[],int low,int high)
{
	int mid;
	//write code here divide arrays and call merge function 
    if (low < high)
    {
            mid =(low+high)/2;
            sort(a, low, mid);
            sort(a, mid + 1, high);
            merge(a, low, mid,mid+1, high);
    }
}
void merge(int a[],int low1,int high1,int low2,int high2)
{
    int temp[]=new int[100];    //array used for merging
	int i,j,k;
	i=low1;		//beginning of the first list
	j=low2;		//beginning of the second list
	k=0;
	  // write code here for while there are elements in both lists
	    for(k = low1; i <= high1 && j <= high2; k++)
	    {
        if(a[i] <= a[j])
             temp[k] = a[i++];
        else
             temp[k] = a[j++];
        }
    //write code here for  copy remaining elements of the first list at end of temp[]
	 while(i <= high1)    
      temp[k++] = a[i++];
     //write code here for copy remaining elements of the second list at end of temp[]
	while(j <= high2)   
      temp[k++] = a[j++];
	// write code here for  Transfer elements from temp[] back to a[]
	 for(k = low1; k <= high2; k++)
      a[k] = temp[k];
}
static void printArray(int arr[])
    {
       //write code for Store  sorted values into array and prnit
       for(int i=0;i<arr.length;i++)
       System.out.print(arr[i]+" ");
    }
public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       // write code here , accepting numbers from commndpromptand store in Array,Array name is arr
       System.out.println("Merge Sort Test ");
       System.out.println("Enter number of integer elements ");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter "+ n +" integer elements ");
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
        /* Call method sort */
         Merge_sort_Ex1 ob = new  Merge_sort_Ex1();
        ob.sort(arr, 0, arr.length-1);
        System.out.println("\nSorted array");
        printArray(arr);
    }
}
