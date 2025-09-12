public class MaasHesaplayici {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ahmet Karabacak", 2000, 45, 2005);
        Employee emp2 = new Employee("Haydar Dümen", 800, 38, 2015);
        Employee emp3 = new Employee("Ahmet Kaya", 3000, 50, 1995);

        Payroll.printSalaryReport(emp1);
        Payroll.printSalaryReport(emp2);
        Payroll.printSalaryReport(emp3);
    }
}