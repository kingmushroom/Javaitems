package anotherExample;

public class PersonalInfo {
public Contactdetails contactDetails;
public Office officeDetails;
public Exams examDetails;
public PersonalInfo(){
	contactDetails = new Contactdetails();
	examDetails=new Exams();
}
public Contactdetails getContactDetails() {
	return contactDetails;
}
public void setContactDetails(Contactdetails contactDetails) {
	this.contactDetails = contactDetails;
}
public Office getOfficeDetails() {
	return officeDetails;
}
public void setOfficeDetails(Office officeDetails) {
	this.officeDetails = officeDetails;
}
public Exams getExamDetails() {
	return examDetails;
}
public void setExamDetails(Exams examDetails) {
	this.examDetails = examDetails;
}
}
