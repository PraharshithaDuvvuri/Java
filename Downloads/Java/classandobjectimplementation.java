class classandobjectimplementation {
    //Real-world objects share two characteristics: They all have state and behavior. Dogs have state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail). Bicycles also have state (current gear, current pedal cadence, current speed) and behavior (changing gear, changing pedal cadence, applying brakes). Identifying the state and behavior for real-world objects is a great way to begin thinking in terms of object-oriented programming.In the real world, you'll often find many individual objects all of the same kind. There may be thousands of other bicycles in existence, all of the same make and model. Each bicycle was built from the same set of blueprints and therefore contains the same components. In object-oriented terms, we say that your bicycle is an instance of the class of objects known as bicycles. A class is the blueprint from which individual objects are created.
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
