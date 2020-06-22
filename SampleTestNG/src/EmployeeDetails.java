// Example for TestNG - Writing Tests lesson

// EmployeeDetails class is used to:
// + get/set the value of employee's name.
// + get/set the value of employee's monthly salary.
// + get/set the value of employee's age.

public class EmployeeDetails {
    private String Name;
    private double Salary;
    private int Age;

    // Return the name
    public String getName(){
        return Name;
    }
    // Parameter name the name to set
    public void setName(String name){
        this.Name = name;
    }

    // Return the monthlySalary
    public double getMonthSalary(){
        return Salary;
    }
    // Parameter monthlySalary the monthlySalary to set
    public void setMonthSalary(double salary){
        this.Salary = salary;
    }

    // Return the Age
    public int getAge(){
        return Age;
    }
    // Parameter Age the Age to set
    public void setAge(int age){
        this.Age = age;
    }
}
