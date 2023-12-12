public class arrayofobjects{
    public static void main(String[] args) {
        Sample[] a;
        a = new Sample[5];
        a[0] = new Sample(1, "Praharshitha");
        a[1] = new Sample(2, "Sai");
        a[2] = new Sample(3, "Ramu");
        a[3] = new Sample(4, "Krishna");
        a[4] = new Sample(5, "Aravindh");
        for(Sample i:a){//foreach loop definition as foreach loops are used to iterate through arrays.
            System.out.println(i.roll_no + " "+i.name+ " "+i);//a[i]-->address of objects will be stored.
            //a[i].roll_no --> roll no will be accessed for each index and printed.
            //a[i].name --> name will be accessed for each index and printed.
        }
        System.out.println();
    }
}
class Sample{
    int roll_no;
    String name;
    
    //constructor //constructor is called every time a new object is created.It is used for instantiating the value of fields in a class.(fields-->roll_no,name).It is nothing but a method with parameters as fields of a class whose values are being sent as parameters so that the fields can be initialized differently each time constructor is called.
    public Sample (int r, String n){
        this.roll_no = r;
        this.name = n;
    }
}