package SingleResponsibility_DesignPrinciple.Example_Backend_Employee_mangmt.BetterCode;

public class Employee {

    private final int employeeId;

    public Employee(int id) {

        this.employeeId = id;

    }


    public int getEmployeeId() {

        return this.employeeId;

    }
}
