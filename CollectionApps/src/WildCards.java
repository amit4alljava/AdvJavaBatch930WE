import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

class X
{
	
}
class A extends X implements Serializable
{
	
}
class B extends A{
	
}
class C extends A
{
	
}
class D
{
	
}
class T
{
	//static void print(ArrayList<Object> aList){
	static void print(ArrayList<?> aList){
	//static void print(ArrayList<? super A> aList){
	//static void print(ArrayList<? extends Serializable> aList){
	//static void print(ArrayList<? extends A> aList){
	//static void print(ArrayList<A> aList){
		System.out.println(aList);
	}
}

public class WildCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Limitation of Generics
		// Before Java 5
		ArrayList list = new ArrayList(); // Non-Generic
		list.add("Hello");
		list.add(1000.20);
		list.add(true);
		list.add(new Scanner(System.in));
		String temp = (String)list.get(0);
		// Non-Generic can Take anything
		// The Problem you need to typecast every time to reterive 
		// the values
		// It treat everything as Object
		// Java 5 Generic Collection
		ArrayList<String> strList = new ArrayList<>(); //Generic
		// Now it can take only String
		strList.add("Hello");
		//strList.add(1000.20);
		//strList.add(true);
		//strList.add(new Scanner(System.in));
		temp = strList.get(0);
		
		A obj = new B();  // Upcasting
		A obj2[] = {new B(), new C(), new A()};
		ArrayList<A> aList = new ArrayList<>();
		ArrayList<B> bList = new ArrayList<>();
		ArrayList<C> cList = new ArrayList<>();
		ArrayList<D> dList = new ArrayList<>();
		ArrayList<X> xList = new ArrayList<>();
		T.print(aList);
		T.print(xList);
		T.print(bList);
		T.print(cList);
		T.print(dList);
		
		T.print(strList);
		
		
		
		

	}

}
