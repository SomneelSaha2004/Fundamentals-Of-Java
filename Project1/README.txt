Package ElevatorSimulation 1.0

The following package has been designed for the simulation of elevators in Building consisting of 10 floors with a Basement.
Input handlers have not been added.
However the necessary functions have been provided which if tied to buttons on the actual floors of a floor will work fine.

Class Building:
    Member Variables:
        Elevator A - To simulate an elevator named A which can reach and acess all floors except the Basement.
        Elevator B - To simulate an elevator named B which can reach and acess all floors except the Penthouse.
        Scanner sc - To get input for the simulation of the use of the elevators.
    Member Methods:
         Building(int elevatorAPos,int elevatorBpos) - To initiate an object of type Building and recieve input for the initial position of the two elevators A and B.

         void callElevatorA(int floor,String direction) - to simulate the action of calling Elevator A where the floor number and a direction must be provided. Also to simulate the event of using the elevator after calling it the method also calls the useElevatorA() methpd for spontaneity.

         void callElevatorB(int floor,String direction) - to simulate the action of calling Elevator B where the floor number and a direction must be provided. Also to simulate the event of using the elevator after calling it the method also calls the useElevatorA() methpd for spontaneity.

         void useElevatorA() - to simulate the actual Elevator A being used where only legal input is tolerated for the particular Elevator

         void useElevatorB() - to simulate the actual Elevator B being used where only legal input is tolerated for the particular Elevator

Class Elevator:
    This class is abstract and is not intended to be used for object creation.

    Member Variables:
        int currentFloor - to keep track of the Elevators current floor

Class ElevatorA:
    This class extends the Elevator class and has the same members as the Elevator class.

    Memeber Methods:
        ElevatorA(int currentFloor) - to initiate an object of type ElevatorA and initialise the member currentFloor to a given legal floor, this elevator can access all floors except the Basement.
        
        ElevatorA() - to initiate an object of type ElevatorA and initialise the member currentFloor to a default value, this elevator can access all floors except the Basement.

        void move(int destinationFloor,String direction) - to simulate the movement the of an elevator where a direction and floor number have been provided.

        void move(int destinationFloor) - to simulate the movement the of an elevator where a floor number has been provided.

        int getCurrentFloor() - to get the current floor of this ElevatorA object.

Class ElevatorB:
    This class extends the Elevator class and has the same members as the Elevator class.

    Memeber Methods:
        ElevatorB(int currentFloor) - to initiate an object of type ElevatorB and initialise the member currentFloor to a given legal floor, this elevator can access all floors except the Penthouse.
        
        ElevatorB() - to initiate an object of type ElevatorB and initialise the member currentFloor to a default value, this elevator can access all floors except the Penthouse.

        void move(int destinationFloor,String direction) - to simulate the movement the of an elevator where a direction and floor number have been provided.

        void move(int destinationFloor) - to simulate the movement the of an elevator where a floor number has been provided.

        int getCurrentFloor() - to get the current floor of this ElevatorB object.


