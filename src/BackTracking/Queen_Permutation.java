package BackTracking;

public class Queen_Permutation {
    public static void main(String[] args) {
        int n=4;
        int tq=2;
        boolean [] board=new boolean[n];
        res(board,tq,0,"",0);
    }
    public static void res(boolean [] board,int tq,int cq,String ans,int s)
    {
        if(cq==tq)
        {
            System.out.println(ans);
            return;
        }
        else
        {
            for(int i=s;i<board.length;i++)
            {
                if(!board[i])
                {
                    cq++;
                    board[i]=true;
                    s++;
                    res(board,tq,cq,ans+ "b"+i+"q"+(cq-1),s);
                    cq--;
                    board[i]=false;
                }
            }
            s++;
        }

    }
}
