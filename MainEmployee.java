
public class MainEmployee {

	public static void main(String[] args) {
		salaryEmployee se = new salaryEmployee("Sasha", "QA engineer", 5000);
		System.out.println("Salary: " + se.calculatePay() + "$ per week");
		HourlyEmployee he = new HourlyEmployee("Dasha", "QA team lead", 182, 50);
		System.out.println("Salary = " + he.calculatePay() + "$ per month");
	}
}
