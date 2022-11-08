import java.util.*;
public class Rain_Water_Trapping {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int len=sc.nextInt();
            int arr[]=new int[len];
            for(int i=0;i<len;i++)
            {
                arr[i]=sc.nextInt();
            }
            int left []=new int[len];
            int right[]=new int[len];
            left[0]=arr[0];
            for(int i=1;i<left.length;i++)
            {
                left[i]=Math.max(arr[i],left[i-1]);
            }
            right[len-1]=arr[len-1];
            for(int i=len-2;i>=0;i--)
            {
                right[i]=Math.max(arr[i],right[i+1]);
            }
            int sum=0;
            for(int i=0;i<arr.length;i++)
            {
                sum+=Math.min(left[i],right[i])-arr[i];
            }
            System.out.println(sum);



        }

    }
}