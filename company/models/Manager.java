package company.models;
import company.abstracts.Employee;

public class Manager extends Employee {
	
	public Manager(String n, double s, int i){
		super(n,s,i);}

	@Override
	public void work() { System.out.println("Manager " + this.getName() + " in managing ...");}

}
