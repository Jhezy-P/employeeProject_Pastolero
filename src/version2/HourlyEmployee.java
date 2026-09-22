package version2;

public class HourlyEmployee {

    private int empID;
    private Name empName;
    private float totalHoursWorked;
    private double ratePerHour;
    private MyDate birthDate;
    private MyDate dateHired;


    private static final double REGULAR_HOURS = 40.0;
    private static final double OVERTIME_RATE = 1.5;

    public HourlyEmployee() {
    }

    public HourlyEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired) {
        this.empID = empID;
        this.empName = empName;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
        totalHoursWorked = 0;
        ratePerHour = 0;
    }


    public HourlyEmployee(int empID, Name empName, float totalHoursWorked, double ratePerHour, MyDate birthDate, MyDate dateHired) {
        this.empID = empID;
        this.empName = empName;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
    }


    public int getEmpID() {
        return empID;
    }

    public Name getEmpName() {
        return empName;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public MyDate getDateHired() {
        return dateHired;
    }


    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public void setBirthDate(MyDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
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
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Date Hired: " + dateHired);
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Rate Per Hour: " + ratePerHour);
    }


    @Override
    public String toString() {
        return String.format(
                "Employee ID: %d \n" +
                        "Name: %s \n" +
                        "Birth Date: %s \n" +
                        "Date Hired: %s \n" +
                        "Hours Worked: %.2f \n" +
                        "Rate Per Hour: $%.2f \n" +
                        "Computed Salary: $%.2f",
                empID,
                empName,
                birthDate,
                dateHired,
                totalHoursWorked,
                ratePerHour,
                computeSalary()
        );
    }
}