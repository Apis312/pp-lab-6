package company;
import company.Employable.Employable;

public abstract class Employee implements Employable{
	
	private String name;
	private double salary;
	private int id;
	
	public Employee(String n, double s, int i){
		System.out.println("Konstruktor employee");
		setName(n);
		setSalary(s);
		setId(i);
	}
	
	
	
	public void setName(String n) {this.name = n;}
	public void setSalary(double s) {this.salary = s;}
	public void setId(int i) {this.id = i;}
	
	public String getName() {return this.name;}
	public double getSalary() {return this.salary;}
	public int getId() {return this.id;}
	
	
	

}
