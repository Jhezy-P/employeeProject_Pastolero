package version1;

public class PieceWorkerEmployee {

    private int empID;
    private String empName;
    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
        empID = 0;
        empName = "N/A";
        totalPiecesFinished = 0;
        ratePerPiece = 0;
    }

    public PieceWorkerEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
        totalPiecesFinished = 0;
        ratePerPiece = 0;
    }

    public PieceWorkerEmployee(int empID, String empName, double ratePerPiece, int totalPiecesFinished) {
        this.empID = empID;
        this.empName = empName;
        this.ratePerPiece = ratePerPiece;
        this.totalPiecesFinished = totalPiecesFinished;
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

    public double computeSalary(){
        double basePay = totalPiecesFinished * ratePerPiece;
        int completeHundreds = totalPiecesFinished / 100;
        double bonusPay = completeHundreds * (10 * ratePerPiece);

        return basePay + bonusPay;
    }

    public void displayPieceWorkerEmployee(){
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Total Pieces Finished: " + totalPiecesFinished);
        System.out.println("Rate Per Piece: " + ratePerPiece);
    }

    @Override
    public String toString(){
        return String.format(
                "Employee ID: %d%n\n" + "Employee Name: %s%n\n" + "Total Pieces Finished: %d%n\n" + "Rate Per Piece: %.2f%n\n" + "Salary: %.2f\n",
                empID,
                empName,
                totalPiecesFinished,
                ratePerPiece,
                computeSalary()
        );
    }
}
