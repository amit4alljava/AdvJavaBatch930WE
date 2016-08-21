import java.util.ArrayList;

class Stack<T extends Number>
{
	private ArrayList<T> list = new ArrayList<>();
	public void push(T data){
		list.add(data);
	}
	public T pop(){
		if(list.size()>0){
		return list.remove(list.size()-1);
		}
		else{
			return null;
		}
	}
	public void peep(){
		for(int i = list.size()-1 ; i>=0; i--){
			System.out.println(list.get(i));
		}
	}
}
public class Template {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stack<String> stack = new Stack<>();
//		stack.push("ram");
//		stack.push("shyam");
//		stack.push("tom");
//		stack.peep();
//		stack.pop();
//		System.out.println("After Pop");
//		stack.peep();
		
		System.out.println("***********************************");
		Stack<Integer> stack2 = new Stack<>();
		stack2.push(1000);
		stack2.push(2000);
		stack2.push(3000);
		stack2.peep();
		stack2.pop();
		System.out.println("After Pop");
		stack2.peep();
		
		
	}

}
