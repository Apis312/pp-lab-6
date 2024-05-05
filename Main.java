import java.util.ArrayList;
import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {

	public static void main(String[] args) {
		
		Worker w1 = new Worker("Adam", 1234.5 , 1);
		w1.setHireDate("2019,05");
		
		Worker w2 = new Worker("Krzyś", 2345.6 , 1);
		w2.setHireDate("2020,01");
		
		Worker w3 = new Worker("Grześ", 4321 , 3);
		w3.setHireDate("2015,03");
	
		//Worker w4 = new Worker("Michał", 3421.8 , 4);
		//w4.setHireDate("2021,08");
		
		Manager m1 = new Manager("Rafał", 9876.54 , 0);
		m1.setHireDate("2009,05");
		
		
		System.out.println(w1.getName() + " has code " + w1.hashCode());
		System.out.println(w2.getName() + " has code " + w2.hashCode());
		System.out.println(w3.getName() + " has code " + w3.hashCode());
		
		System.out.println(m1.getName() + " has code " + m1.hashCode());
		
		System.out.println( w1.equals(w2) );
		System.out.println( w1.equals(w3) );
		System.out.println( w1.equals(m1) );
		
		
		
		
		/*
		m1.work(); System.out.println(m1.getSalary());
		
		w1.work(); System.out.println(w1.getSalary());
		w2.work(); System.out.println(w2.getSalary());
		w3.work(); System.out.println(w3.getSalary());
		w4.work(); System.out.println(w4.getSalary()); 
		
		
		// lista
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(m1);
		employees.add(w1);
		employees.add(w2);
		employees.add(w3);
		employees.add(w4);
		
		for (Employee p : employees) {System.out.println(p.getName() + " " + p.hashCode() + " " + p.getPosition() + " " + p.getHireDate() +" " + p.getSalary());
			p.work();}  */
		
		
	

}}
