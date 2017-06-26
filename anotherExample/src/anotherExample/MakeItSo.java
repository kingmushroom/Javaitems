package anotherExample;

public class MakeItSo {

	static PersonalInfo[] people=new PersonalInfo[10];
	
	
	public static void main(String args[]){
		Office o = new Office();
		for(int a=0;a<10;a++){
			people[a] = new PersonalInfo();
			people[a].setOfficeDetails(o);
			
		}
		
		for(PersonalInfo person:people){
			person.examDetails.setChe(120);
			person.examDetails.setPhy(120);
			person.examDetails.setMat(120);
			person.examDetails.calc();
			person.examDetails.showResults();
		}
		
	}
}
