package addressbook;
import java.util.Scanner;
public class Address {

    private String city;
	private String state;
	private int zip;
	
	public void setCity(String city) {
		this.city=city;
	}
	
	public String getCity() {
		return city;
	}
	public void setState(String state) {
		this.state=state;
	}
	public String getState() {
		return state;
	}
	public void setZip(int zip) {
		this.zip=zip;
	}
	public int getZip() {
		return zip;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	
}