package ch07.sec11;

public class SealExample {

	public static void main(String[] args) {
		Director d = new Director();
		Employee e = new Employee();
		Manager m = new Manager();
		Person p = new Person();
		
		workPrint(d);
		workPrint(e);
		workPrint(m);
		workPrint(p);
	}
	
	public static void workPrint(Person p) {
		p.work();
	}
}
