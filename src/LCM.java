import java.util.*;
public class LCM {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1>n2)
        {
            for(int i=1;i<=100;i++)
            {
                int pro=n1*i;
                if(pro%n2==0)
                {
                    System.out.println(pro);
                    break;
                }

            }
        }
        else if(n2>n1)
        {
            for(int i=1;i<=100;i++)
            {
                int pro1=n2*i;
                if(pro1%n1==0)
                {
                    System.out.println(pro1);
                    break;
                }

            }
        }
        else{
            System.out.println(n1);
        }


    }
}