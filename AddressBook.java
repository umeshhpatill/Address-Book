package addressbook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class AddressBook extends Person implements AddressBookInterface {
	private static final String CSV_HEADER = "FristName,LastName,mobileNumber,state,city,zip";
	Person person = new Person();
	private static String filePath = "abc.csv";
	FileWriter fileWriter = null;
	private static Formatter x;
	private static Scanner y;
	private static String choice, name;
	
	
	public void addPerson() {
		String addbook;
		FileWriter fileWriter = null;
		Scanner scanner = new Scanner(System.in);
		AddressBookManager addBookManager = new AddressBookManager();
		List<Person> user = new ArrayList<>();
		
		
		System.out.println("Enter first name");
		String firstName=scanner.next();
		person.setFristName(firstName);
		System.out.println("Enter last name");
		String lastName=scanner.next();
		person.setLastName(lastName);
		System.out.println("mobile number");
		long mobileNumber=scanner.nextLong();
		person.setMobileNumber(mobileNumber);
		System.out.println("Enter state");
		String state=scanner.next();
		Address address=new Address(); 
		address.setState(state);
		System.out.println("Enter city name");
		String city=scanner.next();
		address.setCity(city);
		System.out.println("Enter zip");
		int zip=scanner.nextInt();
		address.setZip(zip);
		
		//print first name
		
		//print address get city + address getzip
		System.out.println("1: for save data in file ");
		System.out.println("2: for skip data in file ");
		
		int i=scanner.nextInt();
		if (i==1) { 
			
		
		try {
			fileWriter = new FileWriter(filePath,true);
			
            //fileWriter(CSV_HEADER);
            //fileWriter('\n');
			BufferedWriter bw = new BufferedWriter(fileWriter);
			PrintWriter prinwrt= new PrintWriter(bw);
		
			fileWriter.append("");
			//for (Person person : user) {
				person.println(person.getFristName()+","+person.getLastName()+","+person.getMobileNumber()+","+address.getState()+","+address.getCity()+","+address.getZip());
				//print get last name
				
                //person print mobile number
         		//person print get state
				//person print get city
				//person print get zip
				//pw.println('\n');
				prinwrt.flush();
				prinwrt.close();

			
			System.out.println("done");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
	} 
		System.out.println("data  saved");
		}
		
		
		else {
			System.out.println("data not saved");
		}
			
	}


	