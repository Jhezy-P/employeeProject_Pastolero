package version2;

public class Name {

    private String firstName;
    private String lastName;
    private String middleInitial;

    public Name() {

    }


    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        middleInitial = "N/A";
    }

    public Name(String firstName, String lastName, String middleInitial) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInitial = middleInitial;
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

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleName(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getFullName() {
        return firstName + " " + middleInitial + ". " + lastName;
    }

    @Override
    public String toString() {
        return getFullName();
    }
}
