interface Bicycle{
    public void changeGear(int value);
    public void speedUp(int value);
    public void changeCadence(int value);
    public void applyBrakes(int value);
    public void printStates();
}
class MyBicycle implements Bicycle{
    int cadence = 0;
    int speed = 0;
    int gear = 1;

   // The compiler will now require that methods
   // changeCadence, changeGear, speedUp, and applyBrakes
   // all be implemented. Compilation will fail if those
   // methods are missing from this class.

    public void changeCadence(int newValue) {
         cadence = newValue;
    }

    public void changeGear(int newValue) {
         gear = newValue;
    }

    public void speedUp(int increment) {
         speed = speed + increment;   
    }

    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    public void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}
class interfaceimplementation {
    public static void main(String[] args) {
        MyBicycle mybike = new MyBicycle();
        mybike.changeCadence(50);
        mybike.speedUp(10);
        mybike.changeGear(2);
        mybike.applyBrakes(5);
        mybike.printStates();
        

    }
}
