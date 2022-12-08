package mini.hackaton;

import java.util.List;

public class CustomerDemo {
	public static void main(String[] args) {
		//lastnames to try
		//Marrier
		//Flosi
		//Figeroa
		List<Customer> customerList = miniHackathon.loadVendorData();
		
		
		CustomerRepo.getCustomerInfo(customerList);
		
		CustomerRepo.getCustomerByState(customerList);
	}
}

