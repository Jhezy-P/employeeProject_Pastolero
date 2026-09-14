import version1.HourlyEmployee;

public static class Main {
        public static void main(String[] args){

            HourlyEmployee employee1 = new HourlyEmployee();

            employee1.setEmpID(101);
            employee1.setEmpName("Jhezy Pastolero");
            employee1.setTotalHoursWorked(40.0f);
            employee1.setRatePerHour(150.00);

            System.out.println("Employee 1");
            employee1.displayHourlyEmployee();

            System.out.println("\nUsing toString():");
            System.out.println(employee1);

            HourlyEmployee employee2 = new HourlyEmployee(
                    102,
                    "Nicholai Gayares",
                    45.0f,
                    200.00
            );

            System.out.println("\nEmployee 2");
            employee2.displayHourlyEmployee();

            System.out.println("\nUsing toString():");
            System.out.println(employee2);
        }
    }
}