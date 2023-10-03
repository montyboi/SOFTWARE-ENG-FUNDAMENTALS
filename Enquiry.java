public class Enquiry {
    private String query;
    private String response;

    public Enquiry(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }
}
