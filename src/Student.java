import java.util.ArrayList;
import java.util.List;

/**
 * Created by ethan on 2017-02-07.
 */
public class Student extends Person {
    String major;
    boolean fulltime;
    List<Course> courseList = new ArrayList<Course>();

    public Student(String name, String emailAddress, String major, boolean fulltime) {
        super(name, emailAddress);
        this.fulltime = fulltime;
        this.major = major;
    }

    public void addCourse(Course c){
        courseList.add(c);
    }

    public String toString() {
        return String.format("Name: %s\nMajor: %s\nEmail: %s", this.name, this.major, this.emailAddress);
    }
}
