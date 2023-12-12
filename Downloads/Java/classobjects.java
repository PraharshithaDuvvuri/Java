public class classobjects {
    static int roll_no;
    static String name;
    static void set(int r,String n){
        roll_no=r;
        name =n;
    }
    public static void get(){
        System.out.println("Student name is: "+ name);
        System.out.println("Student roll no is: "+ roll_no);
    }
    @Override
    public String toString(){
        return "Student name: "+name +" "+"roll number is: "+ roll_no;
    }
    public static void main(String[] args) {
        classobjects s1 = new classobjects();
        classobjects.set(2, "hinata");
        classobjects.get();
        System.out.println(s1);
    }
}
