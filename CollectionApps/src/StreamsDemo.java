import java.util.ArrayList;

class Employee
{
	private int id;
	private String name;
	private double salary;
	Employee(int id , String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1001,"Ram",19999));
		empList.add(new Employee(1002,"Sim",29999));
		empList.add(new Employee(1003,"Rim",39999));
		empList.add(new Employee(1004,"Kim",59999));
		empList.add(new Employee(1005,"Tim",79999));
		empList.add(new Employee(1006,"Shyam",99999));
		double sum = 0.0;
		// Old Way
//		for(Employee emp : empList){
//			if(emp.getSalary()>20000){
//				sum = sum + emp.getSalary();
//			}
//		}
//		System.out.println("Sum is "+sum);
	// Java 8 Stream 
//		double totalSum = empList.stream()
//		.filter((e)->e.getSalary()>20000)
//		.mapToDouble((x)->x.getSalary()).sum();
//		System.out.println("Total Sum is "+totalSum);
	
		double totalSum = empList.parallelStream()
				.filter((e)->e.getSalary()>20000)
				.mapToDouble((x)->x.getSalary()).sum();
				System.out.println("Total Sum is "+totalSum);
	}

}
