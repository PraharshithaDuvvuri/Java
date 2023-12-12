public class nonstaticvariable {
    int a = 8;
    public static void main(String[] args) {
        staticvariable s = new staticvariable();
        System.out.println("Value of variable 'a' is: " + s.a);
        s.a = 10;
        System.out.println(s.a);
        staticvariable s1 = new staticvariable();
        System.out.println(s1.a);
        s1.a = 20;
        System.out.println(s1.a);
        System.out.println(s.a);
    }
}
