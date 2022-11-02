package Super_150;

import java.util.Scanner;
public class compareTo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int len=Math.min(s1.length(),s2.length());
        int f=0;
        for(int i=0;i<len;i++) {
            if (s1.charAt(i) == s2.charAt(i)) ;
            else if (s1.charAt(i) > s2.charAt(i)) {
                f = 1;
                System.out.println(1);
                break;
            } else {
                System.out.println(-1);
                f = 1;

                break;
            }
        }
        if(s2.length()>s1.length()) System.out.println(-1);
        else
        {
            System.out.println(1);
        }



    }
}
