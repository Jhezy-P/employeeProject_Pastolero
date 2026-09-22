package version2;

public class PieceWorkerEmployee {

    private int empID;
    private Name empName;
    private int totalPiecesFinished;
    private double ratePerPiece;
    private MyDate birthDate;
    private MyDate dateHired;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired) {
        this.empID = empID;
        this.empName = empName;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
        totalPiecesFinished = 0;
        ratePerPiece = 0;
    }

    public PieceWorkerEmployee(int empID, Name empName, double ratePerPiece, int totalPiecesFinished, MyDate birthDate, MyDate dateHired) {
        this.empID = empID;
        this.empName = empName;
        this.ratePerPiece = ratePerPiece;
        this.totalPiecesFinished = totalPiecesFinished;
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

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
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
        double basePay = totalPiecesFinished * ratePerPiece;
        int completeHundreds = totalPiecesFinished / 100;
        double bonusPay = completeHundreds * (10 * ratePerPiece);

        return basePay + bonusPay;
    }

    public void displayPieceWorkerEmployee(){
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Date Hired: " + dateHired);
        System.out.println("Total Pieces Finished: " + totalPiecesFinished);
        System.out.println("Rate Per Piece: " + ratePerPiece);
    }

    @Override
    public String toString(){
        return String.format(
                "Employee ID: %d%n\n" + "Employee Name: %s%n\n" + "Birth Date: %s%n\n" + "Date Hired: %s%n\n" + "Total Pieces Finished: %d%n\n" + "Rate Per Piece: %.2f%n\n" + "Salary: %.2f\n",
                empID,
                empName,
                birthDate,
                dateHired,
                totalPiecesFinished,
                ratePerPiece,
                computeSalary()
        );
    }
}