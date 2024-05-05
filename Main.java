import company.models.Manager;
import company.models.Worker;

public class Main {

	public static void main(String[] args) {
		
		Worker w1 = new Worker("Adam", 1234.5 , 1);
		Worker w2 = new Worker("Krzyś", 2345.6 , 2);
		Worker w3 = new Worker("Grześ", 4321 , 3);
		Worker w4 = new Worker("Michał", 3421.8 , 4);
		
		Manager m1 = new Manager("Rafał", 9876.54 , 0);
		
		m1.work(); System.out.println(m1.getSalary());
		
		w1.work(); System.out.println(w1.getSalary());
		w2.work(); System.out.println(w2.getSalary());
		w3.work(); System.out.println(w3.getSalary());
		w4.work(); System.out.println(w4.getSalary());
		
		
	}

}
