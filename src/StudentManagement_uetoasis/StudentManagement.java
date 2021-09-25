package StudentManagement_uetoasis;

// TODO: Auto-generated Javadoc
/**
 * The Class StudentManagement.
 */
public class StudentManagement {
  Student[] students = new Student[100];

  /**
   * Same group.
   *
   * @param s1 the s 1
   * @param s2 the s 2
   * @return true, if successful
   */
  public static boolean sameGroup(Student s1, Student s2) {
    if ((s1.getGroup()).equals(s2.getGroup())) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Adds the student.
   *
   * @param newStudent the new student
   */
  public void addStudent(Student newStudent) {
    int length = 0;
    for (Student stu : students) {
      if (stu == null) {
        break;
      }
      length++;
    }
    students[length] = newStudent;
  }

  /**
   * Students by group.
   *
   * @return the string
   */
  public String studentsByGroup() {
    int length = 0;
    for (Student stu : students) {
      if (stu == null) {
        break;
      }
      length++;
    }
    if (length != 0) {
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
    } else {
      return "";
    }
  }

  /**
   * Removes the student.
   *
   * @param id the id
   */
  public void removeStudent(String id) {
    int length = 0;
    for (Student stu : students) {
      if (stu == null) {
        break;
      }
      length++;
    }
    for (int i = 0; i < length; i++) {
      if (students[i].getId().equals(id)) {
        for (int j = i; j < length - 1; j++) {
          students[j] = students[j + 1];
        }
        length--;
        students[length] = null;
        i--;
      }
    }
  }

  /**
   * The main method.
   *
   * @param args the arguments
   */
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
    Student student4 = new Student("d", "4", "test@123");
    sm.addStudent(student4);
    Student student5 = new Student("e", "6", "test@123");
    sm.addStudent(student5);
    Student student6 = new Student("f", "3", "test@123");
    sm.addStudent(student6);
    System.out.println(StudentManagement.sameGroup(student2, student3));
    System.out.println(sm.studentsByGroup());
    sm.removeStudent("3");
    System.out.println(sm.studentsByGroup());
  }
}
