public class stringslost {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat(" World");
        System.out.println(str); // Here the reference variable still points to the original string object.As the new string object is not assigned to the reference variable.So the second new string is lost forever.
        str = str.concat(" Praharshitha");//here a new string object is created and assigned to the reference variable.So, technically our ref variable will point to the new string object.
        System.out.println(str);
    }
}
