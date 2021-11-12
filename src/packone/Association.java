package packone;

class Student {

    String stuName;
    int stuage;

    public Student(String stuName, int age) {
        this.stuName = stuName;
        this.stuage = age;
    }

    void printStudent(Subject sub) {
        System.out.println("Student name : " + stuName + "\n"
                + "Student age : " + stuage + "\n"
                + "Subject name : " + sub.subName + "\n"
                + "Subject Credit : " + sub.credit
        );
    }

}

class Subject {

    String subName;
    int credit;

    public Subject(String subName, int credit) {
        this.subName = subName;
        this.credit = credit;
    }

}

public class Association {

    public static void main(String[] args) {
        Student objStudent = new Student("janith", 14);
        Subject objSubject = new Subject("Math", 20);
        objStudent.printStudent(objSubject);
    }
}
