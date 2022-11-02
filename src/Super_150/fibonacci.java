package Super_150;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0||n==1)
        {
            System.out.println(n);
        }
        else
        {

            int n1=0,n2=1,c=n1+n2;
            for(int i=0;i<n;i++)
            {
                c=n1+n2;
                n1=n2;
                n2=c;
            }
            System.out.println(c);
        }
    }
}
