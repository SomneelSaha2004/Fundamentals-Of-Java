package submission7;
public class Car extends Vehicle{
    protected boolean isDriving;
    Car(String Make,String Model,int Year,double Weight)
    {
        super(Make,Model,Year,Weight);
        
    }
    void Drive()
    {
        if(!isDriving)
        {
       isDriving=true;TripsSinceMaintenence+=1;
       if(TripsSinceMaintenence>100)
       {NeedsMaintenance=true;}
        }
    }
    void Stop()
    {isDriving=false;}
    //Extra method for printing details only acessible in the class itself
    private void printDetails()
    {
        System.out.println("\tMake: "+Make+"\n"+"\tModel: "+Model+"\n\tYear: "+Year+"\n\tWeight: "+Weight+"\n\tTrips Since Maintenence: "+TripsSinceMaintenence+"\n\tNeeds Maintenance: "+NeedsMaintenance+"\n\tIs Driving: "+isDriving);
    }
    //Code to test Car class
    // public static void main(String[] args)
    // {
    //     Car c1=new Car("Sedan","a",2004,234);
    //     Car c2=new Car("SUV","b",2013,500);
    //     Car c3=new Car("Truck","c",2020,600);
    //     for(int i=0;i<59;i++)
    //     {
    //         c1.Drive();
    //         c1.Stop();
    //     }
    //     for(int i=0;i<101;i++)
    //     {
    //         c2.Drive();
    //         c2.Stop();
    //     }
    //     for(int i=0;i<35;i++)
    //     {
    //         c3.Drive();c3.Stop();
    //     }
    //     c1.printDetails();c2.printDetails();c3.printDetails();
    // }
}