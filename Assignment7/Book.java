public class Book extends Literature{
    protected String publisher,genre;
    Book(String title,String author,String publisher,String genre)
    {
        this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.genre=genre;
    }
    @Override void Print()
    {
        System.out.println("Title: "+title+"\n"+"Author: "+author+"\n"+"\tPublisher: "+publisher+"\n"+"\tGenre: "+genre);
    }
    //test code
    // public static void main(String[] args)
    // {
    //     Book b=new Book(
    //         "Harry Potter",
    //         "J.K.Rowling",
    //         "Penguin Publishing",
    //         "Fiction/Fantasy"
    //     );
    //     b.Print();
    // }
}