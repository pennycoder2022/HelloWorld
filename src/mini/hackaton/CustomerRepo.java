package mini.hackaton;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerRepo {
	public static final String out = String.format("%-25s %-35s %-15s %-15s %-15s %-15s", "Name", "Address","City","ZIP", "Phone","Email");
	

	public static Customer getCustomer(List<Customer> customerList) {
		Customer outCustomer = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter last name of a Customer:");
		String lastName = scanner.nextLine().trim();
	
		for(Customer cur:customerList) {
			if(cur.getLastName().equalsIgnoreCase(lastName)) {
				outCustomer = cur;
			}
		}

		System.out.println(out);
		System.out.println(outCustomer.info());
		return outCustomer;
	}
	
	public static List<Customer> getCustomerByState(List<Customer> customerList) {
		List<Customer> customerListByState = new ArrayList<Customer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter state of a Customer:");
		String state = scanner.nextLine().trim();
		
		System.out.println(out);
		for(Customer cur:customerList) {
			if(cur.getState().equalsIgnoreCase(state)) {
				customerListByState.add(cur);
				System.out.println(cur.info());
			}
		}
		scanner.close();	
		return customerListByState;
	}
	
	public static String getCustomerInfo(List<Customer> customerList) {
		Customer customer = getCustomer(customerList);
			
		return customer==null?"No customer found":customer.info();
	}
}
