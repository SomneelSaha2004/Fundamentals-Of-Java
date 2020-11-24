public class Poem extends Literature{
    protected String style;
    Poem(String title,String author,String style)
    {
        this.title=title;
        this.author=author;
        this.style=style;
    }
    @Override void Print(){
        super.Print();
        System.out.println("\tStyle: "+style);
    }
    //test code
    // public static void main(String[] args)
    // {
    //     Poem p=new Poem("Daffodils","William Wordsworth","Nature Ballad");
    //     p.Print();
    // }
}