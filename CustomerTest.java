// Marisol Miramontes, 4306-001
import javax.swing.JOptionPane; 


public class CustomerTest implements Invoice 

{
  
    String programData1()
    {
      Address add=new Address("786 Cooper","Arlington","Texas",76019);
      Customer c=new Customer("Jones",add,12345);
      c.setCType(Customer.CustomerType.STUDENT);
      Date startDate1=new Date(1,1,2015);
      Date endDate1=new Date(1,2,2015);
      Course course1=new OnlineCourse("Java1", "Davis", 125, startDate1, endDate1, "UTA", true, 12);
      course1.setcType(Course.CourseType.PROGRAMMING);
      c.addCourse(course1);
      Date startDate2=new Date(2,2,2015);
      Date endDate2=new Date(1,3,2015);
      Course course2=new OnlineCourse("Java2", "Davis", 125, startDate2, endDate2, "UTA", true, 12);
      course2.setcType(Course.CourseType.PROGRAMMING);
      c.addCourse(course2);
      Date startDate3=new Date(15,1,2015);
      Date endDate3=new Date(3,2,2015);
      Course course3=new InClassCourse("Canon Pictures", "Long", 75, startDate3, endDate3, "COB 142");
      course3.setcType(Course.CourseType.PHOTOGRAPHY);
      c.addCourse(course3);
      String output = createInvoice(c);
        return output;
    }

    String programData2()
    {
      Address add=new Address("921 Bowen","Arlington","Texas",76006);
      Customer c=new Customer("Smith",add,65489);
      c.setCType(Customer.CustomerType.FACULTY);
      Date startDate1=new Date(2,3,2015);
      Date endDate1=new Date(31,3,2015);
      Course course1=new OnlineCourse("Relieve Stress", "Jones", 35, startDate1, endDate1, "None", false, 5);
      course1.setcType(Course.CourseType.MISC);
      c.addCourse(course1);
      Date startDate2=new Date(1,4,2015);
      Date endDate2=new Date(1,5,2015);
      Course course2=new InClassCourse("Play the Piano", "Smith", 40, startDate2, endDate2, "UH 105");
      course2.setcType(Course.CourseType.MUSIC);
      c.addCourse(course2);
      String output =createInvoice(c);
      return output;
    }

    String programData3()
    {
      Address add=new Address("123 Love Lane","Dallas","Texas",75550);
      Customer c=new Customer("Willis",add,27589);
      c.setCType(Customer.CustomerType.GOVERNMENT);
      Date startDate1=new Date(1,1,2015);
      Date endDate1=new Date(1,2,2015);
      Course course1=new OnlineCourse("Relieve Stress", "Jones", 35, startDate1, endDate1, "None", false, 5);
      course1.setcType(Course.CourseType.MISC);
      c.addCourse(course1);
      Date startDate2=new Date(2,3,2015);
      Date endDate2=new Date(31,3,2015);
      Course course2=new InClassCourse("Play the Piano", "Smith", 40, startDate2, endDate2, "UH 105");
      course2.setcType(Course.CourseType.MUSIC);
      c.addCourse(course2);
      String output=createInvoice(c);
      return output;
      
    }


    public static void main(String[] args)
    {
      CustomerTest ct =new CustomerTest();
      String Customerdetail="Name    Account    Charges\n";
      Customerdetail+=ct.programData1()+"\n"+ct.programData2()+"\n"+ct.programData3();
      JOptionPane.showMessageDialog(null,Customerdetail);
      
    }
  
}