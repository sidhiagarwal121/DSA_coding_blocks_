package Super_150;

import java.util.Scanner;

public class Lec_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        if(n>=75)
//        {
//            System.out.println("A");
//        }
//        else if(n>=65 && n<=75)
//        {
//            System.out.println("B");
//        }
//        else if(n>=55 && n<=45)
//        {
//            System.out.println("C");
//        }
//        else
//        {
//            System.out.println("fail");
//        }
//        int n=sc.nextInt();
//        int a=0,b=1;
//            if(n==0 ||n==1)
//            {
//                System.out.println(n);
//            }
//            else
//            {
//                int c=0;
//                for(int i=2;i<n;i++)
//                {
//                    c=a+b;
//                    a=b;
//                    b=c;
//                }
//                System.out.println(c);
//
//
//            }
        int space=4;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
           for(int j=0;j<=i;j++) {
               System.out.print("*");
           }
            System.out.println();
            space--;
        }



    }
}
