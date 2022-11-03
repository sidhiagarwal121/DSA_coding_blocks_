import java.util.*;
public class Print_Armstrong {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1;i<=n2;i++)
        {
            int num1=i,num2=i,num3=i,c=0,s=0;
            while(num1>0)
            {
                num1/=10;
                c++;
            }
            while(num2>0)
            {
                int rem=num2%10;
                s+=Math.pow(rem,c);
                num2/=10;

            }
            if(s==num3)
            {
                System.out.println(s);
            }
        }
    }
}
