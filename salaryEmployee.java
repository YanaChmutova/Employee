
public class salaryEmployee extends Employee {
private double weeklySalary;

	public double getWeeklySalary() {
	return weeklySalary;
}
public salaryEmployee() {}

public salaryEmployee(String name, String jobTitle, double weeklySalary) {
	super(name, jobTitle);
	this.weeklySalary = weeklySalary;
}
public void setWeeklySalary(double weeklySalary) {
	if(weeklySalary>=0)this.weeklySalary = weeklySalary;
}

	@Override
	public double calculatePay() {
		
		return weeklySalary;
	}

}
