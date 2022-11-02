package Super_150;

import java.util.Scanner;

public class SpiralPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int top=0;
        int bottom=4-1;
        int left=0;
        int right=3;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                System.out.println(arr[top][i]+" ");
            }
            top++;
            for(int i=right;i<=bottom;i++)
            {
                System.out.println(arr[right][i]);
            }
            right--;
            if(top<=bottom)
            {

            }
        }
    }
}
