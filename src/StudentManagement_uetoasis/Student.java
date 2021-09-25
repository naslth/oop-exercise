package StudentManagement_uetoasis;

public class Student {
  private String name;
  private String id;
  private String group;
  private String email;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getGroup() {
    return this.group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  String getInfo() {
    String info = this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    return info;
  }

  Student() {
    this.name = "Student";
    this.id = "000";
    this.group = "K62CB";
    this.email = "uet@vnu.edu.vn";
  }

  Student(String name, String id, String email) {
    this.name = name;
    this.id = id;
    this.email = email;
    this.group = "K62CB";
  }

  Student(Student s) {
    this.name = s.name;
    this.id = s.id;
    this.group = s.group;
    this.email = s.email;
  }
}
