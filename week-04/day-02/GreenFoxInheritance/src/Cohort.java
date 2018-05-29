import java.util.ArrayList;
import java.util.List;

public class Cohort {

  private String name;
  private List students;
  private List mentors;

  public Cohort(String name) {
    this.name = name;
    students = new ArrayList();
    mentors = new ArrayList();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List getStudents() {
    return students;
  }

  public void setStudents(List students) {
    this.students = students;
  }

  public List getMentors() {
    return mentors;
  }

  public void setMentors(List mentors) {
    this.mentors = mentors;
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println("The " + name + " cohort has " + students.size() +
            " students and " + mentors.size() + " mentors.");
  }
}
