package fr.ensai.library;

import java.util.Date;

public class Loan {
    private Student student;
    private String item;
    private Date startDate;
    private Date returnDate;

    public Loan(Student student, String item) {
        this.student = student;
        this.item = item;
        this.startDate = new Date();
        this.returnDate = null;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Item " + item + " borrowed by " + student.getName() + ".";
    }
}

