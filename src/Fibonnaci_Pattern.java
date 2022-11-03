import java.util.*;
public class Fibonnaci_Pattern {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=0;
        int n2=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(i==0)
                {
                    System.out.print(0+" ");
                }
                else if(i==1 && j==0)
                {
                    System.out.print(1+" ");

                }
                else{
                    int n3=n1+n2;
                    System.out.print(n3+" ");
                    n1=n2;
                    n2=n3;

                }


            }
            System.out.println();
        }

    }
}