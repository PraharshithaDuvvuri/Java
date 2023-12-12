public class classesobjectsdemo {
    int roll_no;
    String name;
    classesobjectsdemo(int roll_no,String name){
        this.roll_no=roll_no;
        this.name=name;
    }
    // @Override
    // public String toString(){
    //     return "Student name is: "+name + " "+"And "+"Roll number is : "+roll_no;
    // }
    public static void main(String[] args) {
        classesobjectsdemo a = new classesobjectsdemo(422, "Akash");
        System.out.println(a);//hashoce is printed.Internally toString() is called when we print the reference variable and a hashcode is printed which is memory location but if we override this method and return a string which will print the values of our instance variables accessed through our object.
    }
}
