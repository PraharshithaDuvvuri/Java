public class finalarrays {
    public static void main(String[] args) {
        final int[] a ={2,3,4};
        a[2] = 10;
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
        // can change state of an object but cannot change reference and arrays are objects and object variables are references.
    }
}
