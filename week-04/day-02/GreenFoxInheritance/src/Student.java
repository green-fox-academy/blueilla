public class Student extends Person implements Cloneable {

  private String previousOrganization;
  private int skippedDays;
  private int numberOfDays;

  public int getNumberOfDays() {
    return numberOfDays;
  }

  public void setNumberOfDays(int numberOfDays) {
    this.numberOfDays = numberOfDays;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
  }

  public Student() {
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    Student student = new Student();
    return student;
  }


  public String getPreviousOrganization() {
    return previousOrganization;
  }

  public void setPreviousOrganization(String previousOrganization) {
    this.previousOrganization = previousOrganization;
  }

  public int getSkippedDays() {
    return skippedDays;
  }

  public void setSkippedDays(int skippedDays) {
    this.skippedDays = skippedDays;
  }

  public int skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
    return numberOfDays;
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() +
            " from " + previousOrganization + " who skipped " + skippedDays
            + " days from the course already.");
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer!!!");
  }
}
