package Day6.JavaLangObjects.Clone;

public class Student implements Cloneable {
    private String name;
    private int age;
    Department studentDepartment;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Department getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(Department studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", studentDepartment=" + studentDepartment.toString() + "]";
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student newStudent = new Student("Vignesh", 21);
        Department dept = new Department();

        dept.setDepartmentId(101);
        dept.setDepartmentName("Computer Science");

        newStudent.setStudentDepartment(dept);
        System.out.println(newStudent);

        System.out.println();

        Student student1 = (Student) newStudent.clone();
        System.out.println(student1);

        newStudent.getStudentDepartment().setDepartmentName("CSBS");
        System.out.println();
        System.out.println(student1); // shallow copy

    }

}

class Department {
    private String departmentName;
    private int departmentId;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Department [departmentName=" + departmentName + ", departmentId=" + departmentId + "]";
    }

}
