import java.util.*;
public class Binary_Search {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int f=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        int m=sc.nextInt();
        int st=0,end=arr.length-1,ans=0;
        while(st<=end)
        {
            int mid = st+ (end - st) / 2;
            if(arr[mid]==m)
            {
                ans=mid;
                f=1;
            }
            if(arr[mid]>m)
            {
                end=mid-1;
            }
            else{
                st=mid+1;
            }

        }
        if(f==0)
        {
            System.out.println(-1);
        }
        else{
            System.out.println(ans);
        }

    }
}