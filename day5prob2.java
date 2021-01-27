/*
write a program to read a line of words and return all the words vertically in the
same order in which they appear  in line
 
Words are returned as a list of strings, complete with spaces when is necessary. 
(Trailing spaces are not allowed).

Each word would be put on only one column and that in one column there will be only 
one word.

Print the string in Double Quotes like "HAY", "ORO"
The line contains only upper case English letters.
Assume that there is only one space between 2 words.


 Sample Test Case-1
 
input = HOW ARE YOU
output = 
"HAY"
"ORO"
"WEU"

 Explanation: Each word is printed vertically. 
HAY
ORO
WEU
 

 Sample Test Case-2
input  =TO BE OR NOT TO BE
output = 
"TBONTB"
"OEROOE"
"   T"

 Explanation
If the above words are written vertially we have the following words 
"TBONTB"
"OEROOE"
"   T"
 
 
Sample Test Case-3
input =HELLO TO YOU
output = 
"HTY"
"EOO"
"L U"
"L"
"O"

Sample Test Case-4
input =ABC DEFG HIK
output =
"ADH"
"BEI"
"CFK"
" G"

Sample Test Case-5
input = TOM LIKE CODER
output =
"TLC"
"OIO"
"MKD"
" EE"
"  R"

 */
 import java.util.*;
class prog2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arrstr = str.split(" ");
        int strlen = arrstr.length;
        List<Integer> list = new ArrayList<Integer>();
        //ArrayList<String> arrl = new ArrayList();
        for(String s1 : arrstr)
        {
            list.add(s1.length());
        }
        int k = Collections.max(list);
        for(int i = 0;i<k;i++)
        {
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<strlen;j++)
            {
                double len = arrstr[j].length();
                if(len>i)
                {
                    sb.append(arrstr[j].charAt(i));
                }
                else
                {
                    sb.append(" ");
                }
            }
            System.out.print(sb.toString().replaceFirst("\\s++$","")+",");
        }
    }
}
