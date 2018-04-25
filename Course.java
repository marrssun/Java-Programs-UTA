
public class Course {

	String title,instructor;
	double price;
	enum CourseType{PROGRAMMING, MATHEMATICS, PHOTOGRAPHY, MUSIC, PAINTING, MISC}
	CourseType cType;
	Date startDate,endDate;
	public Course(String title, String instructor, double price, Date startDate, Date endDate) {
		this.title = title;
		this.instructor = instructor;
		this.price = price;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public Course() {
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public CourseType getcType() {
		return cType;
	}
	public void setcType(CourseType cType) {
		this.cType = cType;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String toString() {
		return "Course [title=" + title + ", instructor=" + instructor + ", price=" + price + ", cType=" + cType
				+ ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	double calculateCharge(Customer.CustomerType c){
		double price=0;
		if(cType == CourseType.PROGRAMMING || cType == CourseType.MATHEMATICS){
			price+=99;
		}
		else if(cType == CourseType.MUSIC ||cType == CourseType.PAINTING || cType == CourseType.PHOTOGRAPHY){
			price+=59;
		}
		else if(cType == CourseType.MISC){
			price+=39;
		}
		price+=this.price;
		return price;
	}
}
