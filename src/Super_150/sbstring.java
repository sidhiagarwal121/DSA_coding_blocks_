package Super_150;

public class sbstring {
    public static void main(String[] args) {
        int n=3;
        toss(0,n," ");

    }
    public static void toss(int i,int len,String res)
    {
        if(i==len ){
            System.out.println(res);
            return;
        }
        if(res.charAt(i)!='H'){
            toss(i+1,len,res+'H');
        }

        toss(i+1,len,res+'T');

    }
}
