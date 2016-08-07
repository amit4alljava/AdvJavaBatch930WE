import java.util.HashSet;

class Book
{
	private int id;
	private String name;
	private String category;
	private double price;
	private String author;
	@Override
	public boolean equals(Object o){
		Book b1= null ;
		boolean isFound = false;
		if(o instanceof Book){
			b1 = (Book)o; // Downcasting
			if(this.id ==b1.id && this.name.equals(b1.name) 
					&& this.category.equals(b1.category) && this.price==b1.price
					&& this.author.equals(b1.author)){
				isFound = true;
			}
		}
		return isFound;
	}
	@Override
	public int hashCode(){
		if(category.equalsIgnoreCase("pro")){
			return 10;
		}
		else
		{
			return 20;
		}
	}
	Book(int id, String name, String category, double price, String author){
		this.id =id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.author = author;
	}
	@Override
	public String toString(){
		return " id " +id +" Name "+name + " Category "+category + " Price "+price + " Author "+author+"\n";
	}
}
public class SetDemo {
// String + Wrapper + Date + Calender - equals and hashCode Override
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Book> bookSet = new HashSet<>();
		Book java = new Book(1001,"Java","Pro",2000,"Katheiy");
		bookSet.add(java);// by default call hashcode and equals of Object class
		Book java2 = new Book(1001,"Java","Pro",2000,"Katheiy");
		bookSet.add(java2);
		Book c = new Book(1002,"C","Pro",2000,"Yashwant");
		bookSet.add(c);
		Book c2 = new Book(1002,"C","Pro",2000,"Yashwant");
		bookSet.add(c2);
		Book networking = new Book(1003,"Network","net",1000,"Tom");
		bookSet.add(networking);
		System.out.println(bookSet);
		System.out.println("HashCode");
		System.out.println("Java HashCode "+java.hashCode());
		System.out.println("Java2 HashCode "+java2.hashCode());
		System.out.println("C HashCode "+c.hashCode());
		System.out.println("C2 hashCode "+c2.hashCode());
		System.out.println("NetWork hashCode "+networking.hashCode());
	}

}
