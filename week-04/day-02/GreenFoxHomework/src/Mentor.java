public class Mentor {
    String name;
    int age;
    String gender;
    String level;


    public String introduce() {
        return "Hi, I'm " + name + ", a" + age + " year old" + gender + level + " mentor.";
    }
    public String getGoal() {
        return "Educate brilliant junior software developers!";
    }
    public Mentor(String name, int age, String gender, String level) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }
    public Mentor () {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        level = "intermediate";
    }
}
