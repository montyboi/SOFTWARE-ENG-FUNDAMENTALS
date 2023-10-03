import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sub-scenario 1: Instructor registers a course
        LearningPortal portal = new LearningPortal();
        Instructor instructor = new Instructor("John Doe");
        Course newCourse = instructor.registerCourse(portal, "Software Engineering");
        System.out.println("Course registered: " + newCourse.getCourseName());

        // Sub-scenario 2: Lodge a general enquiry
        Enquiry enquiry = new Enquiry("How to register for a new course?");
        Manager manager = new Manager("Jane Smith");
        String response = manager.addressEnquiry(enquiry);
        enquiry.setResponse(response);
        System.out.println("Query: " + enquiry.getQuery());
        System.out.println("Response: " + enquiry.getResponse());
    }
}
