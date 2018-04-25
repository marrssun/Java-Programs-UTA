import java.util.ArrayList;

public class Customer {

	String name;
	Address address;
	int accountnumber;
	enum CustomerType{STUDENT, FACULTY, GOVERNMENT}
	CustomerType cType;
	ArrayList<Course> courseList=new ArrayList<Course>();
	
	public Customer(String name, Address address, int accountnumber) {
		
		this.name = name;
		this.address = address;
		this.accountnumber = accountnumber;
	}

	public Customer() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public CustomerType getcType() {
		return cType;
	}

	public void setcType(CustomerType cType) {
		this.cType = cType;
	}

	public void addCourse(Course course) {
		this.courseList.add(course);
	}

	public String getCourseList() {
		String clist="";
		return clist;
	}

	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", accountnumber=" + accountnumber + ", cType="
				+ cType + "]";
	}
	
}


