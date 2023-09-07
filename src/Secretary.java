/*It is possible to implement constructors, setter, getters or any other additional method
        where it is considered necessary.
        1. Declare a class Secretary with the following instance variables:
        - firstName: String
        - lastName: String
        - departmentId: long
        2. Implement a method printMrsSmithDepartment that takes an array of Professor
        objects as parameter and prints to the terminal the value of the departmentId string of
        each element of the array, if for that specific element the lastName value is “Smith”.
        3. Implement a main method where:
        - An array of 3 Secretary objects is allocated.
        - The method printMrsSmithDepartment is called, passing the allocated array
        as parameter.
        - The value of the firstName attribute for each element of the array is printed to
        screen, if for that specific element departmentId > 10.*/


public class Secretary {
    private String firstName;
    private String lastName;
    private long departmentId;

    public Secretary(String firstName, String lastName, long departmentId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentId = departmentId;
    }
    public long getDepartmentId() {
        return departmentId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
