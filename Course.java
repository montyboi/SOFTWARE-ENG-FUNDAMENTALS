import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private Instructor instructor;

    public Course(String courseName, Instructor instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }
}
