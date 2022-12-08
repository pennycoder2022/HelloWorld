package mini.hackaton;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class miniHackathon {
    
    // this is what the vendor (Crufty-Clunky code Inc) has provided
    // loadVendorData() method as a starting point.
    //
    // here are the fields required for a Customer Object:
    //
    //"first_name",
    //"last_name",
    //"company_name",
    //"address",
    //"city",
    //"county",
    //"state",
    //"zip",
    //"phone1",
    //"phone2",
    //"email",
    //"web"
    //
    // Our requirements are:
    // DONE Create  Customer objects, populate them  and utilize one of the
    // WORKING Java collection class data structures ( ArrayList or LinkedList for example) to
    // hold the Customer objects then
    //
    // DONE provide a simple lookup (use Scanner obj) as stated in this part of the BRD,
    // that will take a Last_name as input.
    //
    // DONE ? Place Order (Customer)
    //  2.The system displays the customer's information: name, street, city, zip, phone, email.
    //    given input will be last_name.
    public static List<Customer> loadVendorData()
    {	
       // please map this file to your drive
       String file = "C:\\java_projects\\HelloWorld\\HelloWorld\\src\\mini\\hackaton\\us-500.csv";
       String line;
       
       List<Customer> customerList = new ArrayList<Customer>();
       
       Customer c1;
       try (BufferedReader br =
            new BufferedReader(new FileReader(file))) {
            while((line = br.readLine()) != null){
            	
            	c1 = new Customer();
            	String[] elements = line.toString().split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)",-1);
            	            	
            	c1.setFirstName(elements[0].replace("\"", ""));
            	c1.setLastName(elements[1].replace("\"", ""));
            	c1.setCompanyName(elements[2].replace("\"", ""));
            	c1.setAddress(elements[3].replace("\"", ""));
            	c1.setCity(elements[4].replace("\"", ""));
            	c1.setCounty(elements[5].replace("\"", ""));
            	c1.setState(elements[6].replace("\"", ""));
            	c1.setZip(elements[7].replace("\"", ""));
            	c1.setPhone1(elements[8].replace("\"", ""));
            	c1.setPhone2(elements[9].replace("\"", ""));
            	c1.setEmail(elements[10].replace("\"", ""));
            	c1.setWeb(elements[11].replace("\"", ""));
            	customerList.add(c1);
            }
        } catch (Exception e){
            System.out.println(e);
        }
       return customerList;
    }
}
