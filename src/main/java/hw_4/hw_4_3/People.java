package hw_4.hw_4_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class People implements Comparable<People> {


    int id;
    String name;
    String surname;
    String email;
    int age;
    Gender gender;
    ArrayList<Skill> skills;
    Car car;

    @Override
    public int compareTo(People o) {
        return this.skills.size()-o.getSkills().size();
    }
}
