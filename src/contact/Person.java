package contact;

import node.LinkedList;

public class Person {
    private String firstName;
    private String lastName;
    private String emailid;
    private LinkedList<Long> contactnumber;

    public Person(String firstName, String lastName, String emailid, LinkedList<Long> contactnumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailid = emailid;
        this.contactnumber = contactnumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailid() {
        return emailid;

    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public LinkedList<Long> getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(LinkedList<Long> contactnumber) {
        this.contactnumber = contactnumber;
    }
}




