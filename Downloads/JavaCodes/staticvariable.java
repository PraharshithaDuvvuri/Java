class Staticvariable1 {
     static int a = 8;
    public static void main(String[] args) {
        Staticvariable1 s = new Staticvariable1();
        System.out.println("Value of variable 'a' is: " + s.a);
        Staticvariable1.a=200;
        Staticvariable1 s1 = new Staticvariable1();
        System.out.println("The value of variable through 1st obj is:" + s1.a);
        System.out.println("the value of var through 2nd obj is:"+  s.a);
        System.out.println("The default access is:" + Staticvariable1.a);
    }
}
