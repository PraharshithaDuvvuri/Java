public class cloningofarraysfortwodimensional {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}};
        int[][] a = arr.clone();
        System.out.println(arr.hashCode());
        System.out.println(a.hashCode());//a new array is created to store the values so hashcodes are different.
        System.out.println(arr[0]==a[0]);//but inside the original references are there for each element.So it is a shallow copy.
        System.out.println(arr[1]==a[1]);
    }
}
