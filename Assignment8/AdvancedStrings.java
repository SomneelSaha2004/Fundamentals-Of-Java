public class AdvancedStrings {
    public static void main(String[] args)
    {
        CustomPrinter printer=new CustomPrinter("<< %s >>");
        System.out.println(printer.toString());
    }
}
