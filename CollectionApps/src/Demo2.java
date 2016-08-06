import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

//1st Way to Use Comparator
class SortById implements Comparator<Product>{
	public int compare(Product one, Product two){
		//Integer first = one.getId();
		//Integer second = two.getId();
		//return first.compareTo(second);
	return ((Integer)one.getId()).compareTo((Integer)two.getId());
	}
}
//class SortByName implements Comparator<Product>
//{
//	public int compare(Product one, Product two){
//		//Integer first = one.getId();
//		//Integer second = two.getId();
//		//return first.compareTo(second);
//	return one.getName().compareToIgnoreCase(two.getName())
//	}
//}

// CRUD Operation
class Product implements Comparable<Product>
{
	private int id;
	private String name;
	private double price;
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	Product(int id , String name , double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	// Start From Java 5
	public int compareTo(Product p){
		//return this.name.compareTo(p.name);  // ASCII Order
		//return this.name.compareToIgnoreCase(p.name); 
		return p.name.compareToIgnoreCase(this.name);
	}
	// Before Java 5
//	public int compareTo(Object o){
//		Product p  = null;
//		if(o instanceof Product){
//		 p = (Product)o; //Downcasting
//		 return this.name.compareTo(p.name);
//		}
//		return 0;
//		
//	}
	@Override
	public boolean equals(Object o){
		Product p = (Product )o; // Downcasting
		if(this.id == p.id && this.name.equals(p.name) && 
				this.price == p.price){
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
//SingleTon Class
class ProductOperations{
	private static ProductOperations productOperation;
	public static ProductOperations getObject(){
		if(productOperation==null){
			productOperation = new ProductOperations();
		}
		return productOperation;
	}
	private ProductOperations(){}
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<Product> productList = new ArrayList<>();
	public void sortById(){
		//Collections.sort(productList); // Always Looking for Comparable
		Collections.sort(productList,new SortById()); // Looking for Comparator
		System.out.println("After Sort "); 
		this.print();
	}
	public void sortByName(){
		//Collections.sort(productList); // Always Looking for Comparable
//		Comparator<Product> comp= new Comparator<Product>(){
//			public int compare(Product one, Product two){
//				return one.getName().compareToIgnoreCase(two.getName());
//			}
//		};
		//Collections.sort(productList,comp); // Looking for Comparator
//		Collections.sort(productList,new Comparator<Product>(){
//			public int compare(Product one, Product two){
//			return one.getName().compareToIgnoreCase(two.getName());
//		}
//	});
		Collections.sort(productList,(one,two)->one.getName().compareTo(two.getName()));
		System.out.println("After Sort "); 
		this.print();
	}
	public void sortByPrice(){
		//Collections.sort(productList); // Always Looking for Comparable
		//Collections.sort(productList,new SortById()); // Looking for Comparator
		Collections.sort(productList,(one,two)->((Double)one.getPrice()).compareTo(((Double)two.getPrice())));
		
		System.out.println("After Sort "); 
		this.print();
	}
	public void delete(){
		int index = searchProduct();
		if(index>=0){
			productList.remove(index);
			System.out.println("Record Deleted....");
		}
	}
	public int searchProduct(){
		System.out.println("Enter the Id to Search");
		int id = scanner.nextInt();
		System.out.println("Enter the Product Name to Search");
		String name = scanner.next();
		System.out.println("Enter the Price to Search");
		double price = scanner.nextDouble();
		Product searchProduct = new Product(id, name, price);
		
		//if(productList.contains(searchProduct)){
		int index = productList.indexOf(searchProduct);
		if(index>=0){
			System.out.println("Found...");
		
		}
		else
		{
			System.out.println("Not Found...");
		}
		
		return index;
		
	}
	public void addNewProduct(){
		System.out.println("Enter the Product Id");
		int pid = scanner.nextInt();
		System.out.println("Enter the Product Name");
		String name = scanner.next();
		System.out.println("Enter the Price");
		double price = scanner.nextDouble();
		Product product = new Product(pid,name,price);
		productList.add(product);  // Add Object in ArrayList
	}
	public void print(){
		// 1st way to print (Traditional Loop Style)
//		for(int i = 0 ; i<productList.size(); i++){
//			Product product = productList.get(i);
//			System.out.println(product);
//		}
		//2nd Way to Print (1 Way Traverse (Uni Directional) Java 1.4
//		Iterator<Product> i = productList.iterator();
//		while(i.hasNext()){
//			Product product = i.next(); // Give Current element and 
//			// then move to next element
//			i.remove();  // Remove During Traverse
//			System.out.println(product);
//		}
//		// 3rd Way to Print
//		// 2-way Traverse (Bi-Directional) Java 1.4
//		ListIterator<Product> j = productList.listIterator();
//		while(j.hasNext()){
//			System.out.println(j.next());
//		}
//		while(j.hasPrevious()){
//			System.out.println(j.previous());
//		}
//		//4th Way
//		// Java 5 Enhance For Loop
//		for(Product p : productList){
//			System.out.println(p);
//		}
		//5th Way
		// Java 8 ForEach Function
		productList.forEach((p)->System.out.println(p));
		
		
	}
}
public class Demo2 {

	public static void main(String[] args) {
		ProductOperations prodOpr = ProductOperations.getObject();
		//ProductOperations prodOpr = new ProductOperations();
		Scanner scanner = new Scanner(System.in);
		//ArrayList list = new ArrayList();
		// this is non-generic List
		// it can take anything 
		// if List can take anything the problem is u need
		// to typecast the things from the list before use
		
		//ArrayList<Product> productList = new ArrayList<>();
		// Now this is become Generic List
		// and this list can take only one kind of thing
		// so now no typecasting is required 
		// Generic Feature comes from Java 5
		// From java 7 onwards no need to specifiy generic type
		// in R.H.S
		while(true){
		System.out.println("1. Add A New Product");
		System.out.println("2. Search A Product");
		System.out.println("3. Print All Products");
		System.out.println("4. Delete a Product");
		System.out.println("5. Update a Product");
		System.out.println("6. Sort a Product By Price");
		System.out.println("7. Sort a Product by Name");
		System.out.println("Press 0 to Quit");
		System.out.println("Enter Your Choice");
		int choice = scanner.nextInt();
		switch(choice){
		case 0:
			System.out.println("Quit this Application");
			System.exit(0);
			break;
		case 1:
			prodOpr.addNewProduct();
			break;
		case 2:
			prodOpr.searchProduct();
			break;
		case 3:
			prodOpr.print();
			break;
		case 4:
			prodOpr.delete();
			break;
		case 7 :
			prodOpr.sortById();
			break;
		}
		}

	}

}








