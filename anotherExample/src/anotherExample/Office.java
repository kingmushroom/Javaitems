package anotherExample;

public class Office {
public String NI;
public double Salary;
public String Grade;
public address OfficeAddress;
public Office(){
	OfficeAddress=new address();
	OfficeAddress.city="Cardiff";
	OfficeAddress.postcode="MIK3 M1K";
	OfficeAddress.street="Mike Street";
	NI="JP65465465";
}
public String getNI() {
	return NI;
}
public void setNI(String nI) {
	NI = nI;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double salary) {
	Salary = salary;
}
public String getGrade() {
	return Grade;
}
public void setGrade(String grade) {
	Grade = grade;
}
public address getOfficeAddress() {
	return OfficeAddress;
}
public void setOfficeAddress(address officeAddress) {
	OfficeAddress = officeAddress;
}

}
