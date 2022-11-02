package Super_150;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,i=0;
        while(n>0)
        {
            int rem=n%10;
            sum+=(rem*Math.pow(5,i++));
            n/=10;
        }
        System.out.println(sum);
    }
}
