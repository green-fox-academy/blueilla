public class Student {
    String name;
    int age;
    String gender;
    String previousOrganization;
    int skippedDays;
    //int numberOfDays;


    public String introduce() {
        return "Hi, I'm " + name + ", a" + age + " year old" + gender +
                " from" + previousOrganization + " who skipped" + skippedDays
                + " days from the course already.";
    }
    public String getGoal() {
        return "Be a junior software developer!";
    }
    public int skipDays(int numberOfDays) {
        skippedDays += numberOfDays;
        return numberOfDays;
    }
    public Student(String name, int age, String gender, String previousOrganization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        skippedDays = 0;
    }
    public Student() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        previousOrganization = "The School of life";
        skippedDays = 0;

    }

}
