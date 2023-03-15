package hw_4.hw_4_1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<User> lst = Arrays.asList(
                new User(1, "vasya", "jj@ukr.net", 22),
                new User(2, "kolya", "jj@ukr.net", 32),
                new User(3, "nadya", "jj@ukr.net", 28),
                new User(4, "ira", "jj@ukr.net", 18),
                new User(5, "anna", "jj@ukr.net", 46),
                new User(6, "igor", "jj@ukr.net", 8)
        );
        System.out.println(lst);
        lst.sort((u1,u2) -> u1.age- u2.age);
        System.out.println(lst);
        lst.sort((u1,u2) -> u2.age- u1.age);
        System.out.println(lst);
        lst.sort((u1,u2) -> u1.name.length()- u2.name.length());
        System.out.println(lst);
        lst.sort((u1,u2) -> u2.name.length()- u1.name.length());
        System.out.println(lst);
    }
}
