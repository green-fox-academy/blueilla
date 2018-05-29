public class Sponsor extends Person {

  private String company;
  private int hiredStudent;

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
  }

  public Sponsor() {
    company = "Google";
    hiredStudent = 0;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public int getHiredStudent() {
    return hiredStudent;
  }

  public void setHiredStudent(int hiredStudent) {
    this.hiredStudent = hiredStudent;
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + getName() + " , a " + getAge() + " year old " + getGender() +
            " who represents " + company + " and hired " + getHiredStudent() + " students so far.");
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant software developers!");
  }
}
