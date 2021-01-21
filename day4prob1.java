/*
 Given a group of word/words and number of rows 'n'. 
 write it as shown in the test cases 


Sample Test Case - 1
input = THURSDAY
2
output = TUSAHRDY   


Explanation: Write the word in 2 rows

T   U   S   A
  H    R   D   Y


the word formed is TUSAHRDY

Sample Test Case - 2
input = system
3
output = seytms

Explanation: write the given word in 3 rows 
s         e
  y    t    m
     s

the word is seytms


Sample Test Case-3
input =this is good
2
ti sgohsi od

t   i         s    g   o
  h   s    i         o   d

Explanation:
ti sgohsi od (We have one space in row-1 and another space in row-2) 

*/
import java.util.*
{
    class prog1
    {
        public static void show(String s,int n)
        {
            StringBuilder[] a = new StringBuilder[n];
            for(int i=0;i<n;i++)
            {
                a[i] =new StringBuilder();
            }
            int c = 0;
            
            String nextLine = true;
            
            for(int i = 0;i < s.length() ; i++)
            {
                a[c].append(""+s.charAt(i));
                
                if( c==0 )
                    nextLine = true;
                else if(c==n-1)
                    nextLine = false;
                if(nextLine)
                    c++;
                else
                    c--;
            }
            for(StringBuilder str : a)
            System.out.print(str.toString());
        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            int n = sc.nextInt();
            if(n!=1)
            {
                print(s,n);
            }
            else
                System.out.println(s);
        }
    }
}
