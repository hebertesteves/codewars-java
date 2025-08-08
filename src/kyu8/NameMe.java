package kyu8;

public class NameMe {
    public String firstName;
    public String lastName;
    public String fullName;

    public NameMe(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        this.fullName = this.firstName + " " + this.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public static void main(String[] args) {
        NameMe nameMe = new NameMe("John", "Doe");
        System.out.println(nameMe.getFirstName());
        System.out.println(nameMe.getLastName());
        System.out.println(nameMe.getFullName());
    }
}
