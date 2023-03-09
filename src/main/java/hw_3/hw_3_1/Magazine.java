package hw_3.hw_3_1;

public class Magazine implements Printable {
    String name;

    public Magazine(String name) {
        this.name = name;
    }

    public Magazine() {
    }

    @Override
    public void Print() {
        //....
        System.out.println("Print from Magazine");
    }
}
