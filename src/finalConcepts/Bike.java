package finalConcepts;

public final class Bike { // A class when declared as final can never be inherited
    final int speedLimit=90; // If you make any variable as final, you cannot change the value of the final variable later
    final int numberOfGears; // Blank Final variable. They can be initialized with a value only inside a constructor
    public Bike(){
        numberOfGears=4;
    }
    public void run(){
//        speedLimit=400; // This was a final variable and we were going to change the value of this variable, but this
        // cannot be permitted because final variable once created can never be changed
    }
    public final void mileage(){
        System.out.println("Mileage of the bike");
    }
}
