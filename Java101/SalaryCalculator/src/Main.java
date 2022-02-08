
public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee("Ahmet", "Kural", 1500, 45, 2015);
		System.out.println("Name Surname: "+e1.name+" "+e1.surname+"\n"
				+"Salary: "+e1.salary
				+"\nWork Hours: "+e1.workHours
				+"\nHire Year: "+e1.hireYear);
	
		e1.totalSalary();
	}

}
