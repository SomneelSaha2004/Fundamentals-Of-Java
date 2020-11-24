import java.util.*;
public class ExceptionHandling {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            try{
            System.out.println("Enter number");
            double num=sc.nextDouble();
            System.out.println("Your Number is :"+num);
            System.out.println("\r\n");
            }
            catch(InputMismatchException e){
               System.out.println("Please Enter a valid number.Not a float!");
               e.printStackTrace(System.out);
               sc.nextLine();
                continue;
            }
            finally{
                sc.nextLine();
            }
            
        }
        
    }
}
