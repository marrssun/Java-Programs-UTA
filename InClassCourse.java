
public class InClassCourse extends Course{

	String room;
	
	public InClassCourse(String title, String instructor, double price, Date startDate, Date endDate, String room) {
		super(title, instructor, price, startDate, endDate);
		this.room = room;
	}
	public InClassCourse() {
		
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String toString() {
		return "InClassCourse [room=" + room + ", title=" + title + ", instructor=" + instructor + ", price=" + price
				+ "]";
	}
	double calculateCharge(Customer.CustomerType c){
		double price;
		price=super.calculateCharge(c);
		if(c == Customer.CustomerType.FACULTY)
			price+=5;
		return price;
	}
	
}
