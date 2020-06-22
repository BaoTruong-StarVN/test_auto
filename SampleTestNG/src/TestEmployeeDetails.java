// Example for TestNG - Writing Tests lesson

// TestEmployeeDetails class is used for testing the methods of EmpBusinessLogic class. It does the following:
// + Tests the yearly salary of the employee
// + Tests the appraisal amount of the employee

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmployeeDetails {
    EmployeeDetails employee = new EmployeeDetails();
    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();

    @Test
    public void testCalculateAppriasal(){
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthSalary(8000);

        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        Assert.assertEquals(500,appraisal,0.0,"500");
    }

    // Test to check yearly salary
    @Test
    public void testCalculateYearlySalary(){
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthSalary(8000);

        double salary = empBusinessLogic.calculateYearSalary(employee);
        Assert.assertEquals(96000,salary,0.0,"8000");
    }
}
