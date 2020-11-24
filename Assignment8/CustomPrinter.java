public class CustomPrinter {
    protected String formatString;
    CustomPrinter(String s)
    {
      formatString=s;
    }
    public void println(String input)
    {
        String formatted=String.format(formatString,input);
        System.out.println(formatted);
    }
}
