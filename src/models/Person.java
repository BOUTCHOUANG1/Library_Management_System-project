package models;

public class Person {
    private String firstName; // models.Member name
    private String lastName; // models.Member first name
    private String email; // models.Member email


    public Person(String name, String firstName, String email) {
        this.firstName = name;
        this.lastName = firstName;
        this.email = email;
    }

    // Getters and setters


    public String getfirstName() { return firstName; }
    public void setName(String name) { this.firstName = name; }

    public String getlastName() { return lastName; }
    public void setFirstName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

}
