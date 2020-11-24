package IOstuff;
import java.io.*;
public class FileIO{
    public static void main(String[] args) throws IOException{
        File outFile=new File("OutFile.txt");
        File inputFile=new File("InputFile.txt");
        BufferedReader in=new BufferedReader(FileReader(inputFile));
        BufferedReader out=new BufferedReader(FileWriter(outFile));
         String input="";
         String newInput;
        out.write(input);

        in.close();
        out.close();
    }
}
