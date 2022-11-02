public class MergeTwoArray {
    public static void main(String[] args) {
        int arr1[]={5,8,9};
        int arr2[]={4,7,8};
      int res[]=new int[arr1.length+arr2.length];
      res=(MergeTwoArray(arr1,arr2));
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }

    }
    public static int [] MergeTwoArray(int [] arr1,int [] arr2)
    {
        int i=0;
        int j=0;
        int k=0;
        int [] ans=new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                ans[k++]=arr1[i];
                i++;
            }
            else{
                ans[k++]=arr2[j];
                j++;

            }
        }
        while(i<arr1.length)
        {
            ans[k++]=arr1[i];
            i++;
        }
        while(j<arr2.length)
        {
            ans[k++]=arr2[j];
            j++;
        }
        return ans;
    }
}
