
public class Employee {
	
	String name, surname;
	int salary;
	int workHours;
	int hireYear;
	double tax = 0;
	int bonus;
	int newSalary;
	
	public Employee(String name,String surname, int salary, int workHours, int hireYear) {
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public void tax() {
		if(this.salary <= 1000) {
			tax = 0;
			System.out.println("Tax: "+tax);
		}
		if(this.salary > 1000) {
			tax = salary * (0.03);
			System.out.println("Tax: "+tax);
		}
	}
	
	public void overTime() {
		while(this.workHours > 40) {
			int overtime = this.workHours - 40;
			bonus = overtime * 30;
			System.out.println("OverTime: "+bonus);
			break;
		}
	}
	
	public void raiseSalary() {
		int workingYear = 2021 - this.hireYear;
		
		if(workingYear >= 0 && workingYear <10) {
			double raise = this.salary * 0.05;
			newSalary = (int) (raise + this.salary);
			System.out.println(this.name+" "+this.surname+" will get %5 raise.");
			System.out.println("Increased Salary : "+newSalary);
		}
		if(workingYear >= 10 && workingYear <20) {
			double raise = this.salary * 0.1;
			newSalary = (int) (raise + this.salary);
			System.out.println(this.name+" "+this.surname+" will get %10 raise.");
			System.out.println("Increased Salary : "+newSalary);
		}
		if(workingYear >= 20) {
			double raise = this.salary * 0.15;
			newSalary = (int) (raise + this.salary);
			System.out.println(this.name+" "+this.surname+" will get %15 raise.");
			System.out.println("Increased Salary : "+newSalary);
		}
	}
	
	public void totalSalary() {
		tax();
		overTime();
		raiseSalary();
	}
}
