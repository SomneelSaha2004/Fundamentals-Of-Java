wqdxx
public class assignment4{
    String reverseString(String s)
    {
        String ans="";
        for(int i=s.length()-1;i>=0;i--)
        {
            ans+=s.charAt(i);
        }
        return ans;
    }
    boolean isPalindrome(String s)
    {return s.equals(reverseString(s));}
    int randBetween(int min,int max)
    {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    // public static void main(String[] args)
    // {
    //     assignment4 a=new assignment4();
    //     System.out.println(a.reverseString("Hello World!"));
    //     System.out.println(a.isPalindrome("hoooh"));
    //     System.out.println(a.randBetween(1,10));
    //     System.exit(0);
    // }
    //Above code is to test the above defined/written functions
}