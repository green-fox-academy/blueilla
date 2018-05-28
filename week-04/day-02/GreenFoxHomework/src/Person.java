public class Person {
    String name;
    int age;
    String gender;


    public String introduce() {
        return "Hi, I'm " + name + ", a" + age + " year old" + gender + ".";
    }
    public String getGoal() {
        return "My goal is, live for the moment!";
    }
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Person() {
        name = "Jane Doe";
        age = 30;
        gender = "female";

    }
}
