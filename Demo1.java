import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(99999);
		list.add(1000); // add at End
		list.add(2000);
		//list.add("amit");
		//list.add(0,"ram");
		System.out.println(list);
		System.out.println("Size is "+list.size());
		//list.remove(1);
		System.out.println(list);
		System.out.println(list.get(0));  // list[0]
		boolean isFound = list.contains("tom");
		System.out.println(isFound);
		//list.set(0, "Mike");
		System.out.println("After Set "+list);
		Collections.sort(list);
		System.out.println("After Sort "+list);
		

	}

}
