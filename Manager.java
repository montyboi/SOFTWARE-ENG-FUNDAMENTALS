
public class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String addressEnquiry(Enquiry enquiry) {
        return "Response to " + enquiry.getQuery();
    }
}
