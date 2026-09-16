package version3;

public class Name implements Cloneable {
    private String firstName;
    private String middleName;
    private  String lastName;
    private String suffix;

    public Name() {
        firstName = "N/A";
        middleName = "N/A";
        lastName = "N/A";
        suffix = "N/A";
    }

    public Name(String firstName, String middleName) {
        this.firstName = firstName;
        this.middleName = middleName;
        lastName = "N/A";
        suffix = "N/A";
    }

    public Name(String firstName, String middleName, String lastName, String suffix) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String displayName(){
        return lastName + " ," + firstName + " " + middleName + " ," + suffix + " ";
    }

    @Override
    public String toString(){
        return displayName();
    }

}
