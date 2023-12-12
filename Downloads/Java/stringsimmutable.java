public class stringsimmutable {
    public static void main(String[] args) {
        String s = "vizag";
        s = s.concat(" district");
        System.out.println(s); // vizagdistrict
        //When the above statement is executed, the VM takes the value of String str, i.e. “knowledge” and appends ” base”, giving us the value “knowledge base”. Now, since Strings are immutable, the VM can’t assign this value to str, so it creates a new String object, gives it a value “knowledge base”, and gives it reference str.
    }
}
