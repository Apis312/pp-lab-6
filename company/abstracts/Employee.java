package company.abstracts;
import company.interfaces.Employable;

public abstract class Employee implements Employable{
	
	private String name;
	private double salary;
	private int id;
	private String hireDate;
	
	public Employee(String n, double s, int i){
		System.out.println("Konstruktor employee");
		setName(n);
		setSalary(s);
		setId(i);
	}
	
	
	
	public void setName(String n) {this.name = n;}
	public void setSalary(double s) {this.salary = s;}
	public void setId(int i) {this.id = i;}
	public void setHireDate(String d) { this.hireDate = d;}
	
	public String getName() {return this.name;}
	public double getSalary() {return this.salary;}
	public int hashCode() {return this.id;}
	public String getHireDate() {return this.hireDate;}
	
	
	public String getPosition() {return "" + this.getClass().getSimpleName();}
	
	@Override
    public boolean equals(Object obj) {
		
		//System.out.println(" test " + this.hashCode() + "  =? " + obj.hashCode());
		
        if( this == obj || this.hashCode() == obj.hashCode()) {return true;}
        else if(obj == null || this != obj) {return false;}
        else {return false;}
       	}
	
	
	
	

}
