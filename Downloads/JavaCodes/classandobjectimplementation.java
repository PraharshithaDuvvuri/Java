class classandobjectimplementation {
    int speed=0;
    int cadence=0;
    int gear=1;
    
    void changeGear(int value){
        gear = value;
    }
    void speedUp(int value){
        speed = speed + value;
        }
    void changeCadence(int value){
        cadence = value;
    }
    void applyBrakes(int value){
        speed = speed - value;
    }
    void printStates(){
        System.out.println("Gear: "+gear+"  Speed: "+speed+" Cadence: "+cadence);
    }

}
class MountainBike extends classandobjectimplementation {

    // new fields and methods defining 
    // a mountain bike would go here
    

}
class RoadBike extends classandobjectimplementation{

}
class bicycledemo{
    public static void main(String[] args) {
        classandobjectimplementation mybike = new classandobjectimplementation();
        classandobjectimplementation mybike2 = new classandobjectimplementation();
        mybike.changeGear(3);
        mybike.speedUp(15);
        mybike.changeCadence(50);
        mybike.applyBrakes(5);
        mybike.printStates();

        mybike2.changeGear(6);
        mybike2.speedUp(90);
        mybike2.changeCadence(60);
        mybike2.applyBrakes(30);
        mybike2.speedUp(20);
        mybike2.changeGear(4);
        mybike2.printStates();

    }
}
