package ElevatorSimulation;
import java.util.*;
public class Building {
    protected ElevatorA A;
    protected ElevatorB B;
    protected Scanner sc=new Scanner(System.in);
    Building(int elevatorAPos,int elevatorBpos)
    {
        A=new ElevatorA(elevatorAPos);
        B=new ElevatorB(elevatorBpos);
    }
    void callElevatorA(int floor,String direction)
    {
       
       if(floor<0||floor>=10)
       {
           System.out.println("That is not a valid floor number for Elevator A");return;
       }
       A.move(floor,direction);
       useElevatorA();
    }
    void useElevatorA()
    {
        while(true)
       {
        System.out.println("Enter floor where you want to go");
        int floor=sc.nextInt();
           if(floor<0||floor>10)
           {
            
               System.out.println("That is not a valid floor number for Elevator A");
               continue;
           }
           A.move(floor);
           break;
       }
    }
    void callElevatorB(int floor,String direction)
    {
        if(floor<-1||floor>10)
       {
           System.out.println("That is not a valid floor number for Elevator B");return;
       }
       B.move(floor,direction);
       useElevatorB();
    }
    void useElevatorB()
    {
        while(true)
        {
         System.out.println("Enter floor where you want to go");
         int f=sc.nextInt();
            if(f<-1||f>10)
            {
             
                System.out.println("That is not a valid floor number for Elevator B");
                continue;
            }
            B.move(f);
            break;
        }
    }
}
