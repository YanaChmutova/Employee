
public class HourlyEmployee extends Employee {
private double hoursWorked;
private double payRate;

public HourlyEmployee () {}

public HourlyEmployee(String name, String jobTitle, double hoursWorked, double payRate) {
	super(name, jobTitle);
	this.hoursWorked = hoursWorked;
	this.payRate = payRate;
}

public double getHoursWorked() {
	return hoursWorked;
}

public void setHoursWorked(double hoursWorked) {
	if(hoursWorked>=0)this.hoursWorked = hoursWorked;
}

public double getPayRate() {
	return payRate;
}

public void setPayRate(double payRate) {
	if(payRate>=0)this.payRate = payRate;
}

@Override
public double calculatePay() {
	
	return hoursWorked * payRate;
}
}
