public class Payroll {

    public static void printSalaryReport(Employee emp) {
        double tax = emp.tax();
        double bonus = emp.bonus();
        double raise = emp.raiseSalary();

        double salaryWithTaxAndBonus = emp.salary - tax + bonus;
        double totalSalary = emp.salary + raise;

        System.out.println("=================================");
        System.out.println(emp); // toString çağrılır
        System.out.println("Vergi: " + tax);
        System.out.println("Bonus: " + bonus);
        System.out.println("Maaş Artışı: " + raise);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + salaryWithTaxAndBonus);
        System.out.println("Toplam Maaş (Zam ile): " + totalSalary);
        System.out.println("=================================\n");
    }
}

