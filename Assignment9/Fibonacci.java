import java.io.*;
import java.io.IOException;
public class Fibonacci{
    public static void main(String[] args)
    {   BufferedWriter writer=null;
        int code=0;
        try{
            
            writer=new BufferedWriter(new FileWriter("fibonacci.txt"));
            for(long number:getSequence())
            {
                writer.write(String.valueOf(number)+"\n");
            }
            writer.close();
        }    
        catch(IOException e)
        {
            System.err.println("File IO Failed");
            code=1;
            e.printStackTrace();
        }
        finally{
            System.out.println("The Program has Executed with error code: "+code);
            
        
        }
    }
    static long[] getSequence()
    {
        long[] arr=new long[50];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<arr.length;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr;
    }
}
