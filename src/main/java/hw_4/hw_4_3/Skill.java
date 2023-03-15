package hw_4.hw_4_3;

public class Skill {
    String title;
    int exp;

    @Override
    public String toString() {
        return "Skill{" +
                "title='" + title + '\'' +
                ", exp=" + exp +
                '}';
    }

    public Skill(String title, int exp) {
        this.title = title;
        this.exp = exp;
    }

    public Skill() {
    }
}
