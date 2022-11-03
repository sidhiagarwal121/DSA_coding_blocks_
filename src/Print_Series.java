import java.util.*;
public class Print_Series {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int c=0;
        for(int i=1;i<100000;i++)
        {
            int res=(3*i)+2;
            if(res%n2!=0)
            {
                c++;
                System.out.println(res);
            }
            if(c==n1)
            {
                break;
            }

        }


    }
}