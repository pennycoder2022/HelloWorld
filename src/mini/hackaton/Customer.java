package mini.hackaton;

public class Customer {
	private String firstName;
	private String lastName;
	private String companyName;
	private String address;
	private String city;
	private String county;
	private String state;
	private String zip;
	private String phone1;
	private String phone2;
	private String email;
	private String web;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String firstName, String lastName, String companyName, String address, String city, String county,
			String state, String zip, String phone1, String phone2, String email, String web) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.address = address;
		this.city = city;
		this.county = county;
		this.state = state;
		this.zip = zip;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.email = email;
		this.web = web;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", companyName=" + companyName
				+ ", address=" + address + ", city=" + city + ", county=" + county + ", state=" + state + ", zip=" + zip
				+ ", phone1=" + phone1 + ", phone2=" + phone2 + ", email=" + email + ", web=" + web + "]";
	}
	
	public String info() {
		String sf = "%-25s %-35s %-15s %-15s %-15s %-15s";
		String out = String.format(sf, firstName + " " + lastName, address,city,zip, phone1,email);
		
		return out;
				//"Customer [Name=" + firstName + " " + lastName + ", street=" +  address + ", city=" + city + ", zip=" + zip
		//+ ", phone=" + phone1 + ", email=" + email + "]";

	}
}
