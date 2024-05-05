import java.util.ArrayList;
import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Worker w1 = new Worker("Adam", 1234.5 , 1);
		w1.setHireDate("2019,05");
		
		Worker w2 = new Worker("Krzyś", 2345.6 , 1);
		w2.setHireDate("2020,01");
		
		Worker w3 = new Worker("Grześ", 4321 , 2);
		w3.setHireDate("2015,03");
	
		Worker w4 = new Worker("Michał", 3421.8 , 1);
		w4.setHireDate("2021,08");
		
		Worker w5 = new Worker ("Domino", 5643.1 , 3);
		
		
		
		Manager m1 = new Manager("Rafał", 9876.54 , 0);
		m1.setHireDate("2009,05");
		Manager m2 = new Manager ("Bartek", 7653.5, 0);
		Manager m3 = new Manager ("Oskar", 5433.1, 0);
		
		

		// lista
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(m1);
		employees.add(m2);
		employees.add(m3);
		
		employees.add(w1);
		employees.add(w2);
		employees.add(w3);
		employees.add(w4);
		employees.add(w5);
		
		double calkowita = 0;
		double pmen = 0;
		double pprac = 0;
		
		 for (Employee p : employees) {
			 calkowita = calkowita + p.getSalary();
			 if( p instanceof Manager) { pmen = pmen + p.getSalary();}
			 else {pprac = pprac + p.getSalary();}
		 }
		 
		 System.out.println("Suma wszystkich pensji to " + calkowita +"\nPensje menadzerow to " + pmen +"\nPensje pracownikow to " + pprac);
		
		 
		 
		ArrayList<Employee> sprawdzone = new ArrayList<>();
		
		//wyszukiwanie tych samych id 
		 for (Employee p : employees) {
			 for (Employee q : employees) {
				 if(p != q && !sprawdzone.contains(p)) {
				 if(p.equals(q)) { System.out.println("Id " +p.hashCode() + " powtarza się dla pracowników : " + p.getName() + "  " + q.getName());
				 }
				 }
				 
			 
			 }
			 sprawdzone.add(p);
		 
		 }
	
		/*
		System.out.println(w1.getName() + " has code " + w1.hashCode());
		System.out.println(w2.getName() + " has code " + w2.hashCode());
		System.out.println(w3.getName() + " has code " + w3.hashCode()); 8?
		
		
		System.out.println(m1.getName() + " has code " + m1.hashCode());
		
		/*
		System.out.println( w1.equals(w2) );
		System.out.println( w1.equals(w3) );
		System.out.println( w1.equals(m1) ); */
		

}}
