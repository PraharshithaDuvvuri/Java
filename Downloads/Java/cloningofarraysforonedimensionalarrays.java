public class cloningofarraysforonedimensionalarrays {
    public static void main(String[] args) {
       int[] a = {2,4,6};
       int[] b = a;
       int[] c = a.clone();
       System.out.println(a.hashCode());
       System.out.println(b.hashCode());//shallow copy is being done.
       System.out.println(c.hashCode());//deep copy is being done.

    }
}
