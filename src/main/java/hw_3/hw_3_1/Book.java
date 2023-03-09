package hw_3.hw_3_1;

public class Book implements Printable {
    String name;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void Print() {
        //.....
        System.out.println("Print from Book");
    }
}
