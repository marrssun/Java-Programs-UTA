
public interface Invoice{

	default String createInvoice(Customer c){
		double price=0;
		if(c.cType  == Customer.CustomerType.STUDENT){
			price+=25;
		}	
		else if(c.cType  == Customer.CustomerType.FACULTY){
			price+=50;
		}
		else if(c.cType  == Customer.CustomerType.GOVERNMENT){
			price+=35;
		}
		for(int i=0;i<c.courseList.size();i++){
			price+=c.courseList.get(i).calculateCharge(c.cType);
		}
		String res=c.name+"    "+String.valueOf(c.accountnumber)+"      $ "+String.valueOf(price);
		return res;
	}
}
