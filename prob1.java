import java.util.*;
public class test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        String temp = "0";
        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
            {
                temp+=ch;
            }
            else
            {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        //return sum + Integer.parseInt(temp);
        System.out.println(sum + Integer.parseInt(temp));
    }
}
