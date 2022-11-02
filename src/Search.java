import java.util.*;
public class Search {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int arr[]=new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int target=sc.nextInt();
        for(int i=0;i<l-2;i++)
        {
            for(int j=i+1;j<l-1;j++)
            {
                for(int k=j+1;k<l;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==target)
                    {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);

                    }
                }
            }

        }

    }
}