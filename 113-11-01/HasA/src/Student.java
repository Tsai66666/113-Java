public class Student {
    private String studentID;
    private String name;

    public Student()
    {
        new Student("000000", "未知");
    }

    public Student(String studentID)
    {
        new Student(studentID, "未知");
    }

    public Student(String studentID, String name)
    {
        this.studentID = studentID;
        this.name = name;
    }

    public String getStudentID()
    {
        return studentID;
    }
    public String getName()
    {
        return name;
    }

    public void printData() {
        System.out.printf("%s %s", studentID, name);
    }
}
