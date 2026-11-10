public class Student<T> {
    private String studentId;
    private String name;
    private T department;
    private String address;

    public Student(String studentId, String name, T department, String address) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.address = address;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getDepartment() {
        return department;
    }

    public void setDepartment(T department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentID: " + studentId + ", Name: " + name + ", Department: " + department + ", Address: " + address;
    }
}
