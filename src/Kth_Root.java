import java.util.*;
public class Kth_Root {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n=sc.nextLong();
            long k=sc.nextLong();
            long st=1;
            long end=n;
            long ans=0;
            while(st<=end)
            {
                long mid=(st+end)/2;
                if(Math.pow(mid,k)<=n)
                {
                    ans=mid;
                    st=mid+1;;
                }
                else
                {
                    end=mid-1;
                }

            }
            System.out.println(ans);

        }

    }

}
