import java.util.HashMap;
import java.util.HashSet;
class Address
{
	private String state;
	private String city;
	private String pinCode;
	private String steetAddress;
	@Override
	public int hashCode(){
		return Integer.parseInt(pinCode);
//		if(city.equalsIgnoreCase("delhi")){
//			return 10;
//		}
//		else
//		{
//			return 20;
//		}
	}
	@Override
	public boolean equals(Object o){
		boolean isFound = false;
		if(o instanceof Address){
			Address address = (Address)o; // Downcasting
			if(this.city.equals(address.city)
					&& this.state.equals(address.state)
					&& this.pinCode.equals(address.pinCode)
					&& this.steetAddress.equals(address.steetAddress)){
				isFound = true;
			}
		}
		return isFound;
	}
	Address(String state, String city, String pinCode, String streetAddress){
		this.state = state;
		this.city = city;
		this.pinCode = pinCode;
		this.steetAddress = streetAddress;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getSteetAddress() {
		return steetAddress;
	}
	public void setSteetAddress(String steetAddress) {
		this.steetAddress = steetAddress;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pinCode=" + pinCode + ", steetAddress=" + steetAddress
				+ "]";
	}
	
}
class CashCustomer
{
	private int id;
	private String name;
	private double balance;
	private HashMap<String,HashSet<Address>> addressMap= new HashMap<>();
	CashCustomer(int id , String name, double balance){
		this.id = id;
		this.name =name;
		this.balance = balance;
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public HashMap<String, HashSet<Address>> getAddressMap() {
		return addressMap;
	}
	public void setAddressMap(HashMap<String, HashSet<Address>> addressMap) {
		this.addressMap = addressMap;
	}
	@Override
	public String toString() {
		return "CashCustomer [id=" + id + ", name=" + name + ", balance=" + balance + ", addressMap=" + addressMap
				+ "]";
	}
	
	
}
public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,CashCustomer> customerMap = new HashMap<>();
		HashSet<Address> officeSet = new HashSet<>();
		Address delhiOffice = new Address("Delhi","Delhi","11007","Delhi-7"); 
		officeSet.add(delhiOffice);
		Address delhiOffice2 = new Address("Delhi","Delhi","11007","Delhi-7"); 
		officeSet.add(delhiOffice2);
		HashMap<String,HashSet<Address>> addressMap = new HashMap<>();
		addressMap.put("office", officeSet);
		
		CashCustomer amit = new CashCustomer(1001,"amit",9999);
		amit.setAddressMap(addressMap);
		customerMap.put(amit.getName(),amit);
		CashCustomer ram = new CashCustomer(1002,"ram",2222);
		customerMap.put(ram.getName(),ram);
		System.out.println(customerMap);

	}

}
