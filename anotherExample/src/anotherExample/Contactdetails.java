package anotherExample;

public class Contactdetails {
	String email="Generic@Email";
	String tel="123456";
	address Address;
	public Contactdetails(){
		Address=new address();
		
		Address.city="Cardiff";
		Address.postcode="45F GT8";
		Address.street="Miken Street";
	}
public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public address getAddress() {
		return Address;
	}
	public void setAddress(address address) {
		Address = address;
	}

}
