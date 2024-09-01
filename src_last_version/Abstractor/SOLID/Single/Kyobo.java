package Abstractor.SOLID.Single;

public class Kyobo {
    public static void main(String[] args) {
        Book a = new Book("alal","qwwe");
        Book b = new Book("sdsd","ioer");
        Printer printer = new Printer();

        printer.printBookDetails(a);

        printer.printBookDetails(b);
    }
}
