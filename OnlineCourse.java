

public class OnlineCourse extends Course{

	String examProctor;
	boolean video;
	int numberOfChapters;
	public OnlineCourse(String title, String instructor, double price, Date startDate, Date endDate, String examProctor,
			boolean video, int numberOfChapters) {
		super(title, instructor, price, startDate, endDate);
		this.examProctor = examProctor;
		this.video = video;
		this.numberOfChapters = numberOfChapters;
	}
	public OnlineCourse() {
		super();
	}
	public String getExamProctor() {
		return examProctor;
	}
	public void setExamProctor(String examProctor) {
		this.examProctor = examProctor;
	}
	public boolean isVideo() {
		return video;
	}
	public void setVideo(boolean video) {
		this.video = video;
	}
	public int getNumberOfChapters() {
		return numberOfChapters;
	}
	public void setNumberOfChapters(int numberOfChapters) {
		this.numberOfChapters = numberOfChapters;
	}
	public String toString() {
		return "OnlineCourse [examProctor=" + examProctor + ", video=" + video + ", numberOfChapters="
				+ numberOfChapters + ", title=" + title + ", instructor=" + instructor + ", price=" + price + "]";
	}
	double calculateCharge(Customer.CustomerType c){
		double price;
		price=super.calculateCharge(c);
		if(c == Customer.CustomerType.STUDENT)
			price+=20;
		else if(c == Customer.CustomerType.FACULTY)
			price+=25;
		return price;
	}
}
