package StudentManagement_uetoasis;

public class StudentManagement {
  Student[] students;
  int length;

  StudentManagement() {
    students = new Student[100];
    length = 0;
  }

  public static boolean sameGroup(Student s1, Student s2) {
    return (s1.getGroup() == s2.getGroup()) ? true : false;
  }

  public void addStudent(Student newStudent) {
    students[length] = newStudent;
    length++;
  }

  public String studentsByGroup() {
    String[] groups = new String[100];
    String res = "";
    int index = 0;
    for (int i = 0; i < length; i++) {
      boolean check = false;
      for (int j = 0; j < index; j++) {
        if (students[i].getGroup() == groups[j]) {
          check = true;
          break;
        }
      }
      if (!check) {
        groups[index] = students[i].getGroup();
        index++;
      }
    }
    for (int i = 0; i < index; i++) {
      res += groups[i] + "\n";
      for (int j = 0; j < length; j++) {
        if (groups[i] == students[j].getGroup()) {
          res += students[j].getInfo() + "\n";
        }
      }
    }
    return res;
  }

  public void removeStudent(String id) {
    for (int i = 0; i < length; i++) {
      if (students[i].getId() == id) {
        for (int j = i + 1; j < length; j++) {
          students[j - 1] = students[j];
        }
        length--;
        break;
      }
    }
  }

  public static void main(String[] args) {
    Student student = new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn");
    student.setGroup("K62CC");
    System.out.println(student.getInfo());
    StudentManagement sm = new StudentManagement();
    Student student1 = new Student("a", "1", "test@123");
    sm.addStudent(student1);
    Student student2 = new Student("b", "2", "test@123");
    sm.addStudent(student2);
    student2.setGroup("K65N-CLC");
    Student student3 = new Student("c", "3", "test@123");
    sm.addStudent(student3);
    System.out.println(sm.studentsByGroup());
    sm.removeStudent("1");
    System.out.println(sm.studentsByGroup());
  }
}
