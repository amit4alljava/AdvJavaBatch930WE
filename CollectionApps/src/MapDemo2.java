import java.util.ArrayList;
import java.util.HashMap;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,ArrayList<Integer>> phoneMap = new HashMap<>();
		ArrayList<Integer> amitPhone = new ArrayList<>();
		amitPhone.add(10000);
		amitPhone.add(230440);
		phoneMap.put("amit", amitPhone);
		System.out.println(phoneMap);
	}

}
