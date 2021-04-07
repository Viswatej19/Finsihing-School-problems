/*write a program to read a sentence and find the sum of digits in each string if String contains 't' or 'T'.
if no digits are found print 0

the input string contains only numbers between 0-9



for example:
input =
Tw1nkl3 to1 add4
output =
Tw1nkl3(4)
to1(1)
add4(0)

input =
add me
output =
add(0)
me(0)

*/
import java.util.*;
import java.lang.*;
class test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s[] = str.split(" ");
        int sum[] = new int[s.length];
        for(int i=0;i<s.length;i++)
        {
            int count=0;
            char ch[] = s[i].toCharArray();
            for(char alpha:ch)
            {
                if(!((alpha>='a' && alpha<='z')||(alpha>='A' && alpha<='Z')))
                {
                    sum[i]=sum[i]+Character.getNumericValue(alpha);
                }
                if(alpha=='t'||alpha=='T')
                {
                    count++;
                }
            }
            if(count<=0)
            {
                sum[i]=0;
            }
        }
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]+"("+sum[i]+")");
        }
    }
}
