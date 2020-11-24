public class tester {
    public static void main(String[] args)
    {
        
        Literature lit[]=new Literature[5];
        Poem p=new Poem("Daffodils","William Wordsworth","Nature Ballad");
        Book b=new Book(
           "Harry Potter",
             "J.K.Rowling",
            "Penguin Publishing",
             "Fiction/Fantasy");
        lit[0]=p;
        lit[1]=b;
        lit[2]=p;
        lit[3]=b;
        lit[4]=p;
        for(int i=0;i<lit.length;i++)
        {
            System.out.println(lit[i].author);
        }
    }
}
