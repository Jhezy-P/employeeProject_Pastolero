package version2;

public class CommissionEmployee {

    private int empID;
    private Name empName;
    private double totalSale;
    private MyDate birthDate;
    private MyDate dateHired;

    public CommissionEmployee() {
    }

    public CommissionEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired) {
        this.empID = empID;
        this.empName = empName;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
        totalSale = 0;
    }

    public CommissionEmployee(int empID, Name empName, double totalSale, MyDate birthDate, MyDate dateHired) {
        this.empID = empID;
        this.empName = empName;
        this.totalSale = totalSale;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(MyDate birthDate) {
        this.birthDate = birthDate;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    public double computeSalary(){
        if (totalSale < 50000){
            return 0.05 * totalSale;
        } else if (totalSale < 100000){
            return 0.10 * totalSale;
        } else if (totalSale < 500000){
            return 0.15 * totalSale;
        } else {
            return 0.20 * totalSale;
        }

    }

    public void displayCommissionEmployee(){
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Total Sales: ₱" + totalSale);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Date Hired: " + dateHired);

    }

    @Override
    public String toString(){
        return String.format(
                "Employee ID: %d%n\n" + "Employee Name: %s%n\n" + "Total Sales: ₱%.2f%n\n" + "Birth Date: %s%n\n" + "Date Hired: %s%n\n" + "Commission Salary: ₱%.2f\n",
                empID, empName, totalSale, birthDate, dateHired, computeSalary()
        );
    }

}