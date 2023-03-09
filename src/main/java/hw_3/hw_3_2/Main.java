package hw_3.hw_3_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 3.2");

        Drum drum = new Drum(100);
        Gitare gitare = new Gitare(10);
        Trumpet trumpet = new Trumpet(40);


        ArrayList<Instrument>  list = new ArrayList<>();


        list.add(drum);
        list.add(gitare);
        list.add(trumpet);
        list.add(drum);
        list.add(trumpet);

        for (Instrument in:list){
            in.Play();
        }

        System.out.println("end the homework");
    }
}

