import java.util.*;
public class Binary_To_Decimal {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int i=0;
        while(num>0)
        {
            int rem=num%10;
            sum+=rem*(Math.pow(2,i++));
            num/=10;

        }
        System.out.println(sum);

    }
}