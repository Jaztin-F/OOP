
package oop;

class Owners extends Register{
	
	private String  firstname, lastname, gender, dateofbirth, address;
	private int id;
	
	Owners(int id,String firstname,String lastname,String dateofbirth,String address,String gender){
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.dateofbirth=dateofbirth;
		this.address=address;
		this.gender=gender;
		
	}
	public int ID() {
		return id;
	}
	Owners()
	{	
            
	}
        @Override
	public void showInfo() {
		System.out.println(" -----------------Plaese Enter Owner Information ------------------ ");
	}
	public String owner() {
		return "Id Number : "+id+"\n"+"Firstname : "+firstname +"\n"+"Lastname : "+lastname+"\n"+"Gender : "+gender+"\n"+"Date Of Birth : "+ dateofbirth+"\n"+"Address : "+address;
	}
}
