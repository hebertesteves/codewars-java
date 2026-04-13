package kyu8;

public class DinglemouseName {

    private String firstName;
    private String lastName;

    public DinglemouseName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return (firstName + " " + lastName).trim();
    }
}
