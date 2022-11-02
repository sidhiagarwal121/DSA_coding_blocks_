package Super_150;

public class OrderPrint {
    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int right[]=new int[height.length];
        int r_max=0;
        right[height.length-1]=height[height.length-1];
        for(int j=height.length-2;j>=0;j--)
        {
            r_max=Math.max(r_max,height[j]);
            right[j]=r_max;

        }
        for(int i=0;i<right.length;i++)
        {
            System.out.print(right[i]+" ");
        }


    }
}
