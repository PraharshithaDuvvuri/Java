public class strings{
    public static void main(String[] args) {
        String s = "harshitha";
        String s1 = "harshitha";
        s1 = "buffalo";
        System.out.println("s and s1 are equal? "+ (s == s1)); // false because they point to different objects in
        System.out.println(s);
        System.out.println(s1);
        s="buffalo";
        System.out.println("After changing the value of s to buffalo "+ (s==s1));
    }
}