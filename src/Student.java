public class Student {
    private int ID ;
    private String name ;
private Course course ;
public void displayInfo(){

}

    public Student(int ID, String name, Course course) {
        this.ID = ID;
        this.name = name;
        this.course = course;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
