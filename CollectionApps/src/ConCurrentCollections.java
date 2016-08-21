import java.util.concurrent.CopyOnWriteArrayList;

public class ConCurrentCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<Integer> strList = new CopyOnWriteArrayList<>();
		//ArrayList<Integer> strList = new ArrayList<>();
		strList.add(1000);
		strList.add(2000);
		for(Integer i : strList){
			System.out.println(i);
			strList.add(4*i);
		}
		//ListIterator<Integer> itr = strList.listIterator();
		
		System.out.println("After add "+strList);

	}

}
