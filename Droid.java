public class Droid{
    //instance fields
    String name;
    int batteryLevel = 100;

    //constructor
    public Droid(String droidName){
        name = droidName;
        
    }

    //methods
    public void performTask(String task){
        System.out.println(name + " is performing "+task);
        batteryLevel -= 10;
    }
    //Display Battery percentage
    public void displayBatteryLevel(){
        System.out.println(name + " has: "+batteryLevel + "% battery left");
    }
    //Charge droid
    public void chargDroid(int percentage){
        batteryLevel += percentage;
    }

    //Transfer Battery with other droid
    public void transferEnergy(Droid receverDroidName, int percenteage){
        receverDroidName.chargDroid(percenteage);
        batteryLevel -= percenteage;
        System.out.println("Sucessfully charged "+ receverDroidName.name + " " + percenteage);
    }
    //main 
    public static void main(String[] args){

        //instantiating Droid cody
        Droid cody = new Droid("Cody");
        System.out.println(cody);

        //making cody perform learn to fly
        cody.performTask("flying");
        cody.displayBatteryLevel();

        //makig droid jimmy
        Droid jimmy = new Droid("jimmy");
        jimmy.displayBatteryLevel();
        jimmy.performTask("cleaning");
        jimmy.performTask("grass cutting");
        jimmy.performTask("scanning floor");
        jimmy.displayBatteryLevel();

        cody.transferEnergy(jimmy, 20);
        jimmy.displayBatteryLevel();
        cody.displayBatteryLevel();
    }

    public String toString(){
        String description = "Hello I am "+name + " Droid";
        return description;
    }
}