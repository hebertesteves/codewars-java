package kyu8;

public class DinglemouseName {

    private String firstName;
    private String lastName;

    public DinglemouseName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) return "";
        else if (lastName.isEmpty()) return firstName;
        else if (firstName.isEmpty()) return lastName;
        return firstName + " " + lastName;
    }
}
