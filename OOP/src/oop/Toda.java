
package oop;
class Toda extends Register{
	
	private String nameoftoda, cellphonenumber, email, contactperson,address;
	private int id;
	
	
	Toda(int id,String nameoftoda,String cellphonenumber,String email,String contactperson,String address){
	    this.id=id;
		this.nameoftoda=nameoftoda;
		this.cellphonenumber=cellphonenumber;
		this.email=email;
		this.contactperson=contactperson;
		this.address=address;
	}
	Toda(){
		
	}
        @Override
	public void showInfo() {
		System.out.println(" -----------------------Please Enter Toda's Information--------------------------- ");
	}
	
	public String toda() {
		return "Costumer Number : "+id+"\n"+"Name Of Toda : "+nameoftoda+"\n"+"Cell phone Number : "+cellphonenumber+"\n"+"Email : "+email+"\n"+"Contact Person : "+contactperson+"\n"+"Address : "+address;
	}
	
	public int Cnumber() {
		return id;
	}
}

