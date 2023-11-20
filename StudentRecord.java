package Assignment3;
public class StudentRecord {
      String sname;
      int rollno; 
      StudentRecord()
      {
    	  this.sname=sname;
    	  this.rollno=rollno;
    	  System.out.println("Student record ");
    	  System.out.println("-----");
      }
      StudentRecord(String sname,int rollno)
      {
    	  this();
    	  int year=2018;
    	  String branch="BE-Civil";
    	  System.out.println("Name of student        :"+sname);
    	  System.out.println("Roll number of student :"+rollno);
    	  System.out.println("Graduation year :"+year);
    	  System.out.println("Stream of engineering :"+branch);
      }
      public static void main(String[] args) {
    	  StudentRecord Sr=new StudentRecord("John",2); //creating object of class and assigning values
	}
  }
