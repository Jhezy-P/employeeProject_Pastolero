package version2;

public class HourlyEmployee {

    private int empID;
    private String empName;
    private float totalHoursWorked;
    private double ratePerHour;


    private static final double REGULAR_HOURS = 40.0;
    private static final double OVERTIME_RATE = 1.5;

    public HourlyEmployee() {
        empID = 0;
        empName = "N/A";
        totalHoursWorked = 0;
        ratePerHour = 0;
    }

    public HourlyEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        totalHoursWorked = 0;
        ratePerHour = 0;
    }


    public HourlyEmployee(int empID, String empName,
                          float totalHoursWorked, double ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }


    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }


    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double computeSalary() {

        if (totalHoursWorked <= REGULAR_HOURS) {
            return totalHoursWorked * ratePerHour;
        } else {
            double regularPay = REGULAR_HOURS * ratePerHour;

            double overtimeHours = totalHoursWorked - REGULAR_HOURS;

            double overtimePay =
                    overtimeHours * (ratePerHour * OVERTIME_RATE);

            return regularPay + overtimePay;
        }
    }


    public void displayHourlyEmployee() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Rate Per Hour: " + ratePerHour);
    }


    @Override
    public String toString() {
        return String.format(
                "Employee ID: %d \n" +
                        "Name: %s \n" +
                        "Hours Worked: %.2f \n" +
                        "Rate Per Hour: $%.2f \n" +
                        "Computed Salary: $%.2f",
                empID,
                empName,
                totalHoursWorked,
                ratePerHour,
                computeSalary()
        );
    }
}