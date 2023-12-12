public class passingarraytoamethod {
    public static void main(String[] args) {
        int[] a;
        a = new int[10];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        a[5]=6;
        a[6]=7;
        a[7]=8;
        System.out.println("Array passed to method : " + Sample(a));
    }

    public static int Sample(int[] a) {
        int res = 0;
        for(int i=0;i<a.length;i++){
            res += a[i];
        }
        return res;
    }
}
