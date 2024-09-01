package Abstractor.SOLID.Single;

public class Printer {
    public void printBookDetails(Book book){
        System.out.print("title:"+book.getTitle());
        System.out.println();
        System.out.print("author:"+book.getAuthor());
        System.out.print("\n\n");
    }
}
