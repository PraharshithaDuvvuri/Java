public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 390;
        int c = 34567;
        int max = ((a>b)?((a>c)?a:c):((b>c)?b:c));
        System.out.println(max);
    }
}
