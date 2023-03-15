package hw_4.hw_4_3;
import javax.swing.plaf.metal.MetalIconFactory;
import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Skill> skills=new ArrayList<Skill>();
        Skill skill1= new Skill("java",10);
        Skill skill2= new Skill("js",10);
        Skill skill3= new Skill("c++",10);
        skills.add(skill1);
        skills.add(skill2);
        skills.add(skill3);
        ArrayList<Skill> skills1=new ArrayList<Skill>();
        skills1.add(skill1);
        skills1.add(skill2);

        ArrayList<Skill> skills2=new ArrayList<Skill>();
        skills2.add(skill2);
        skills2.add(skill3);
        ArrayList<Skill> skills3=new ArrayList<Skill>();
        skills3.add(skill1);
        skills3.add(skill2);

        ArrayList<Skill> skills4=new ArrayList<Skill>();
        skills4.add(skill1);

        Car car = new Car("toyota",2022,150);
        People people =new People(1,"vasya","pupkin","asd@asd.com",31,Gender.MALE,skills,car);
        People people1 =new People(2,"kokos","pupkin","asd@asd.com",32,Gender.MALE,skills1,car);
        People people2 =new People(3,"ira","pupkin","asd@asd.com",16,Gender.FEMALE,skills2,car);
        People people3 =new People(4,"anna","pupkin","asd@asd.com",19,Gender.FEMALE,skills3,car);
        People people4 =new People(5,"kolya","pupkin","asd@asd.com",44,Gender.MALE,skills4,car);


        HashSet<People> st=new HashSet();
        st.add(people);
        st.add(people1);
        st.add(people2);
        st.add(people3);
        st.add(people4);

       // Удвляем MALE
        st.removeIf(ppl -> ppl.gender == Gender.MALE );
        Iterator<People> i=st.iterator();
      //Виводим
        while(i.hasNext())
        {
            System.out.println(i.next());
        };
        System.out.println("/////////////////////////////////////////////////////////////");


        List<People> ppls = Arrays.asList(people,people1,people2,people3,people4);
        TreeSet<People> tl = new TreeSet<>(ppls);
        System.out.println(tl);


    }
}
