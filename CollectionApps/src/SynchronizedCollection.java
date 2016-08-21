import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strList = new ArrayList<>();
		List<String> synchList = Collections.synchronizedList(strList);

	}

}
