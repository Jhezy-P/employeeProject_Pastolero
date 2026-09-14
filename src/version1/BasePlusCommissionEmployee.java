package version1;

public class BasePlusCommissionEmployee {

    private int empID;
    private String empName;
    private double totalSale;
    private double baseSalary;

    public BasePlusCommissionEmployee() {
        empID = 0;
        empName = "N/A";
        totalSale = 0;
        baseSalary = 0;

    }

    public BasePlusCommissionEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        totalSale = 0;
        baseSalary = 0;

    }

    public BasePlusCommissionEmployee(double baseSalary, int empID, String empName, double totalSale) {
        this.baseSalary = baseSalary;
        this.empID = empID;
        this.empName = empName;
        this.totalSale = totalSale;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale;
    }

    public double sameCommissionRate(){
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

    public double computeSalary(){
        double commissionRate = sameCommissionRate();
        return baseSalary + (totalSale * commissionRate);
    }

    @Override
    public String toString(){
        return String.format(
                "Employee ID: %d%n\n " + "Employee Name: %s%n\n" + "Total Sales: ₱%.2f%n\n" + "Base Salary: ₱%.2f%n\n" + "Commission Rate: %.0f%%%n\n" + "Final Computed Salary: ₱%.2f\n",
                empID,
                empName,
                totalSale,
                baseSalary,
                sameCommissionRate() * 100,
                computeSalary()
        );
    }
}


