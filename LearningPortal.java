import java.util.ArrayList;
import java.util.List;

public class LearningPortal {
    private List<Course> courses = new ArrayList<>();

    public Course addCourse(String courseName, Instructor instructor) {
        Course course = new Course(courseName, instructor);
        courses.add(course);
        return course;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
