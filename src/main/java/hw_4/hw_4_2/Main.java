package hw_4.hw_4_2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> st= new ArrayList<>();
        st.add("one");
        st.add("two");
        st.add("three");
        st.add("four");
        st.add("five");
        st.add("six");
        st.add("seven");
        Collections.sort(st);
        System.out.println(st);
    }
}
