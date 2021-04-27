/*

Write a program to generate the following pattern for any given value 'n'


input = 25
output =
* * * * * * * * * * * * * * * * * * * * * * * * *
* A B C D E F G H I J K L M N O P Q R S T U V W *
* X Y Z A B C D E F G H I J K L M N O P Q R S T *
* U V W X Y Z A B C D E F G H I J K L M N O P Q *
* R S T U V W X Y Z A B C D E F G H I J K L M N *
* O P Q R S T U V W X Y Z A B C D E F G H I J K *
* L M N O P Q R S T U V W X Y Z A B C D E F G H *
* I J K L M N O P Q R S T U V W X Y Z A B C D E *
* F G H I J K L M N O P Q R S T U V W X Y Z A B *
* C D E F G H I J K L M N O P Q R S T U V W X Y *
* Z A B C D E F G H I J K L M N O P Q R S T U V *
* W X Y Z A B C D E F G H I J K L M N O P Q R S *
* T U V W X Y Z A B C D E F G H I J K L M N O P *
* Q R S T U V W X Y Z A B C D E F G H I J K L M *
* N O P Q R S T U V W X Y Z A B C D E F G H I J *
* K L M N O P Q R S T U V W X Y Z A B C D E F G *
* H I J K L M N O P Q R S T U V W X Y Z A B C D *
* E F G H I J K L M N O P Q R S T U V W X Y Z A *
* B C D E F G H I J K L M N O P Q R S T U V W X *
* Y Z A B C D E F G H I J K L M N O P Q R S T U *
* V W X Y Z A B C D E F G H I J K L M N O P Q R *
* S T U V W X Y Z A B C D E F G H I J K L M N O *
* P Q R S T U V W X Y Z A B C D E F G H I J K L *
* M N O P Q R S T U V W X Y Z A B C D E F G H I *
* * * * * * * * * * * * * * * * * * * * * * * * *


input = 30 
output = 
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
* A B C D E F G H I J K L M N O P Q R S T U V W X Y Z A B *
* C D E F G H I J K L M N O P Q R S T U V W X Y Z A B C D *
* E F G H I J K L M N O P Q R S T U V W X Y Z A B C D E F *
* G H I J K L M N O P Q R S T U V W X Y Z A B C D E F G H *
* I J K L M N O P Q R S T U V W X Y Z A B C D E F G H I J *
* K L M N O P Q R S T U V W X Y Z A B C D E F G H I J K L *
* M N O P Q R S T U V W X Y Z A B C D E F G H I J K L M N *
* O P Q R S T U V W X Y Z A B C D E F G H I J K L M N O P *
* Q R S T U V W X Y Z A B C D E F G H I J K L M N O P Q R *
* S T U V W X Y Z A B C D E F G H I J K L M N O P Q R S T *
* U V W X Y Z A B C D E F G H I J K L M N O P Q R S T U V *
* W X Y Z A B C D E F G H I J K L M N O P Q R S T U V W X *
* Y Z A B C D E F G H I J K L M N O P Q R S T U V W X Y Z *
* A B C D E F G H I J K L M N O P Q R S T U V W X Y Z A B *
* C D E F G H I J K L M N O P Q R S T U V W X Y Z A B C D *
* E F G H I J K L M N O P Q R S T U V W X Y Z A B C D E F *
* G H I J K L M N O P Q R S T U V W X Y Z A B C D E F G H *
* I J K L M N O P Q R S T U V W X Y Z A B C D E F G H I J *
* K L M N O P Q R S T U V W X Y Z A B C D E F G H I J K L *
* M N O P Q R S T U V W X Y Z A B C D E F G H I J K L M N *
* O P Q R S T U V W X Y Z A B C D E F G H I J K L M N O P *
* Q R S T U V W X Y Z A B C D E F G H I J K L M N O P Q R *
* S T U V W X Y Z A B C D E F G H I J K L M N O P Q R S T *
* U V W X Y Z A B C D E F G H I J K L M N O P Q R S T U V *
* W X Y Z A B C D E F G H I J K L M N O P Q R S T U V W X *
* Y Z A B C D E F G H I J K L M N O P Q R S T U V W X Y Z *
* A B C D E F G H I J K L M N O P Q R S T U V W X Y Z A B *
* C D E F G H I J K L M N O P Q R S T U V W X Y Z A B C D *
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *


*/
import java.util.*;
class test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==n-1)
                {
                    System.out.println("* ");
                }
                else if(j==0 || j==n-1)
                {
                    System.out.println("* ");
                }
                else
                {
                    if(ch>'Z')
                    {
                        ch='A';
                    }
                    System.out.println((ch++)+" ");
                }
            }
        }
        System.out.println();
    }
}
