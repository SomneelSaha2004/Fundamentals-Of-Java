package ElevatorSimulation;
public class ElevatorA extends Elevator{
    ElevatorA(int currentFloor)
    {
        if(currentFloor>10||currentFloor<0)
        {
            System.out.println("Illegal value of initialisation.");return;
        }
        this.currentFloor=currentFloor;
    }
    ElevatorA()
    {
        currentFloor=0;
    }
    void move(int destinationFloor,String direction)
    {
        int n;
        if(direction.toLowerCase().equals("down"))
        {
             n=currentFloor-destinationFloor;
        }
        else if(direction.toLowerCase().equals("up"))
        {
            n=destinationFloor-currentFloor;
        }
        else{
            System.out.println("Open Door");return;
        }
        for(int i=0;i<n;i++){}//to simulate the time taken by elevator
        System.out.println("Elevator A move to "+destinationFloor);
        this.currentFloor=destinationFloor;
        System.out.println("Open Door");
    }
    void move(int destinationFloor)
    {
        if(currentFloor==destinationFloor)
        {
            System.out.println("Elevator A is already at floor "+destinationFloor);
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
