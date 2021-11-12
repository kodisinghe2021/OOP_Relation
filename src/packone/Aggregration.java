package packone;

class Employee {

    String empName;
    int empID;
    Emp_Child objEmp_child;
    //constructor

    public Employee(String empName, int empID, Emp_Child objEmp_Child) {
        this.empName = empName;
        this.empID = empID;
        this.objEmp_child = objEmp_Child;
    }

    void printMethod() {
        System.out.println("employee name : " + empName + "\n"
                + "employee ID : " + empID + "\n"
                + "Child name : " + objEmp_child.chldName + "\n"
                + "Child age : " + objEmp_child.chldAge
        );
    }
}

class Emp_Child {

    String chldName;
    int chldAge;
//constructor

    public Emp_Child(String chldName, int chldAge) {
        this.chldAge = chldAge;
        this.chldName = chldName;
    }

}

public class Aggregration {

    public static void main(String[] args) {
        Emp_Child objEC = new Emp_Child("baby", 5);
        Employee objEmployee = new Employee("kamal", 234, objEC);
        objEmployee.printMethod();
    }
}
