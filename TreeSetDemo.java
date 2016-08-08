import java.util.Comparator;
import java.util.TreeSet;

class Customer implements Comparable<Customer>{
	private int id;
	private String name;
	public int compareTo(Customer customer){
		return this.name.compareToIgnoreCase(customer.name);
	}
	Customer(int id , String name){
		this.id = id ;
		this.name = name;
		
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
	@Override
	public String toString(){
		return "id "+id+" Name "+name;
	}
	
}
class SortByCustomerId implements Comparator<Customer>{
	public int compare(Customer first , Customer second){
		return ((Integer)first.getId()).compareTo((Integer)second.getId());
	}
}
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet<Customer> customerSet = new TreeSet<>(); 
		// Internally it use Comparable
		//TreeSet<Customer> customerSet= new TreeSet<>(new SortByCustomerId());
		TreeSet<Customer> customerSet = new TreeSet<>
		((first,second)->((Integer)first.getId()).compareTo(second.getId()));
		Customer ram = new Customer(1001,"Ram");
		Customer ram2 = new Customer(1001,"Ram");
		Customer shyam = new Customer(1000,"Shyam");
		customerSet.add(ram);
		customerSet.add(ram2);
		customerSet.add(shyam);
		System.out.println(customerSet);
		
		
	}

}
