import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableSet<Integer> i = new TreeSet<>();
		i.add(10);
		i.add(2);
		i.add(1);
		i.add(5);
		System.out.println(i);
		System.out.println(i.higher(5)); //>
		System.out.println(i.lower(2)); //<
		System.out.println(i.ceiling(5)); //>=
		System.out.println(i.floor(2)); //<=

	}

}
