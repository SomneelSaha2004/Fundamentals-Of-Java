package submission7;
public  class Vehicle{
    protected String Make,Model;
    protected int Year;
    protected double Weight;
    protected boolean NeedsMaintenance;
    protected int TripsSinceMaintenence;
    Vehicle(String Make,String Model,int Year,double Weight)
    {
        this.Make=Make;this.Model=Model;this.Year=Year;this.Weight=Weight;
        this.NeedsMaintenance=false;this.TripsSinceMaintenence=0;
    }
    void setMembers(String Make,String Model,int Year,double Weight)
    {
        this.Make=Make;this.Model=Model;this.Year=Year;this.Weight=Weight;
    }
    void Repair(){
        NeedsMaintenance=false;TripsSinceMaintenence=0;
    }
}