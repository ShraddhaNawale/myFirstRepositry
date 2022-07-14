package methos;

public class patientDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
patientDetail obj=new patientDetail();

patientDetail.patientInfo("rucha", "kale", 23, 05);


	}
public static void patientInfo(String Name, String Surname, int roomNo,int patient_Id)
{
	System.out.println("==================================");
	System.out.println("patient Name is ="+Name);
	System.out.println("patient Surname is ="+Surname);
	System.out.println("patient roomno is ="+roomNo);
	System.out.println("paitent Id is ="+patient_Id);
	
}
}
