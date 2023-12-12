public class finalkeywordinclass {
    int a = 26;
    public static void main(String[] args) {
        final finalkeywordinclass t = new finalkeywordinclass();
        t.a = 800;//can change state of an object or can change property of object.
        final finalkeywordinclass b = new finalkeywordinclass();
        // t = b;//will give error.
        System.out.println(t.a);

    }
}
