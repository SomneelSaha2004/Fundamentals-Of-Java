package ElevatorSimulation;
public class ElevatorB extends Elevator {
    ElevatorB(int currentFloor)
    {
        if(currentFloor>10||currentFloor<-1)
        {
            System.out.println("Illegal Value of Inititalisation");
        }
        this.currentFloor=currentFloor;
    }
    ElevatorB()
    {
        this.currentFloor=0;
    }
    void move(int destinationFloor,String direction)
    {
        
        int n=0;
        if(direction.toLowerCase().equals("down"))
        {
             n=currentFloor-destinationFloor;
        }
        if(direction.toLowerCase().equals("up"))
        {
            n=destinationFloor-currentFloor;
        }
        if(currentFloor==destinationFloor){
            System.out.println("Open Door");return;
        }
        for(int i=0;i<n;i++){}//to simulate the time taken by elevator
        System.out.println("Elevator B move to "+destinationFloor);
        this.currentFloor=destinationFloor;
        System.out.println("Open Door");
    }
    void move(int destinationFloor)
    {
        if(currentFloor==destinationFloor)
        {
            System.out.println("Elevator B is already at floor "+destinationFloor);
            System.out.println("Open Door");
        }
        System.out.println("Elevator A move to "+destinationFloor);
        this.currentFloor=destinationFloor;
        System.out.println("Open Door");
    }
    int getCurrentFloor()
    {
        return currentFloor;
    }
}
