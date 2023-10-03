import java.util.ArrayList;
import java.util.List;

public class Instructor {
    private String name;

    public Instructor(String name) {
        this.name = name;
    }

    public Course registerCourse(LearningPortal portal, String courseName) {
        return portal.addCourse(courseName, this);
    }
}
