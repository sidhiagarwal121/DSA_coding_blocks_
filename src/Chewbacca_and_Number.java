import java.util.*;
public class Chewbacca_and_Number {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1="";
        if(((str.charAt(0))!='9' && (str.charAt(0))>('4')))
        {
            str1+=String.valueOf('9'-(str.charAt(0)));
        }
        else
        {
            str1+=(str.charAt(0));

        }
        for(int i=1;i<str.length();i++)
        {
            if( (str.charAt(i))>('4'))
            {
                int c='9';
                int x=str.charAt(i);
                int min=c-x;
                str1=str1+(String.valueOf(min));
            }
            else
            {
                str1+=(str.charAt(i));

            }

        }
        System.out.print(str1);
    }
}
