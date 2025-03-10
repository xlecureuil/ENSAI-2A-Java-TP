package fr.ensai.library;

public class Magazine extends Item {
    private String issn;
    private String issueNumber;

    // Constructor
    public Magazine(String title, int year, int pageCount, String issn, String issueNumber) {
        super(title, year, pageCount);
        this.issn = issn;
        this.issueNumber = issueNumber;
    }

    // Getters
    public String getIssn() {
        return issn;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    @Override
    public String toString() {
        return "Magazine " + title ;
    }
}