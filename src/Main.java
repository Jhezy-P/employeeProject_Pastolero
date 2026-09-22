
import version2.Name;
import version2.BasePlusCommissionEmployee;
import version2.CommissionEmployee;
import version2.HourlyEmployee;
import version2.MyDate;
import version2.Name;
import version2.PieceWorkerEmployee;


public class Main {
        public static void main(String[] args){

            HourlyEmployee employee1 = new HourlyEmployee();


            employee1.setEmpID(101);
            employee1.setEmpName(new Name("Jhezy Nicholai", "Pastolero","G"));
            employee1.setTotalHoursWorked(40.0f);
            employee1.setRatePerHour(150.00);

            employee1.setBirthDate(new MyDate(20, 9, 2005));
            employee1.setDateHired(new MyDate(2, 9, 2025));


            System.out.println("Employee 1");
            employee1.displayHourlyEmployee();

            System.out.println("\nUsing toString():");
            System.out.println(employee1);

            HourlyEmployee employee2 = new HourlyEmployee();

            employee2.setEmpID(102);
            employee2.setEmpName(new Name("Nicholai", "Gayares", "J"));
            employee2.setTotalHoursWorked(40.0f);
            employee2.setRatePerHour(150.00);
            employee2.setBirthDate(new MyDate(20, 12, 2002));
            employee2.setDateHired(new MyDate(19,2, 2015));

            System.out.println("\nEmployee 2");
            employee2.displayHourlyEmployee();

            System.out.println("\nUsing toString():");
            System.out.println(employee2);
        }
    }
