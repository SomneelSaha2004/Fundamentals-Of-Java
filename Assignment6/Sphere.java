public class Sphere{
    private double radius,pi=Math.PI;
    Sphere(double r)
    {
        radius=r;
    }
    double getRadius(){return radius;}
    double getDiameter(){return 2*radius;}
    double getCircumference(){return 2*pi*radius; }
    double getVolume(){return 4.0/3*pi*radius*radius*radius;}
    double getSurfaceArea(){return 4*pi*radius*radius;}
    void setRadius(double r)
    {radius=r;}
    
}