package company.models;
import company.abstracts.Employee;

public final class Worker extends Employee {

	public Worker(String n, double s, int i) {
		super(n, s, i);
		
	}

	@Override
	public void work() {System.out.println("Worker " + this.getName() + " is working ...");}

	
	
}
