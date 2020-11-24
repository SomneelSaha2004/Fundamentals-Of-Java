import java.io.*;
public class CSVtoTSVConverter {
    public static void main(String[] args)
    {
        try{
            BufferedReader in = new BufferedReader(new FileReader("fifa.csv"));
            BufferedWriter out=new BufferedWriter(new FileWriter("fifa-tab.tsv"));
            String input="";
            while(in.readLine()!=null)
            {
                input=in.readLine().replace(",","\t");
                out.write(input);           
            }
            in.close();
            out.close();
            System.out.println("File IO Successful");
        }
        catch(IOException e)
        {
            System.out.println("File IO Failed");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
