public class stringbufferclass {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");
        str.append(" I am Praharshitha.");
        System.out.println(str);
        str.insert(2,"Fuck this world!");
        System.out.println(str.toString());
    }
}
