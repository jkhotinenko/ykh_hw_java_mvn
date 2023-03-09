package hw_3.hw_3_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Yaroslav!!!");

        Book book1 = new Book("Book #1");
        Magazine magazine1 = new Magazine("Magazine #1");


        ArrayList<Printable> list = new ArrayList<>();
        list.add(book1);
        list.add(magazine1);

        System.out.println("Finish");
    }
}
;


