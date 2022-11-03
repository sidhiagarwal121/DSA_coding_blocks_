import java.util.*;
public class Decimal_to_Octal {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        // int con=decimal_to_binary(num);
        int ans=binary_to_octal(num);
        System.out.println(ans);


    }
    // static int decimal_to_binary(int num)
    // {
    //     int sum=0;
    //     int i=0;
    //     while(num>0)
    //     {
    //         int rem=num%10;
    //         sum+=rem*(Math.pow(10,i++));
    //         num/=2;

    //     }
    // 	return sum;
    // }
    static int binary_to_octal(int num1)
    {
        int sum1=0;
        int i=1;
        while(num1>0)
        {
            int rem=num1%8;
            sum1+=rem*i;
            i*=10;
            num1/=8;

        }
        return sum1;
    }
}
