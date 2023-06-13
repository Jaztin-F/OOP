
package oop;

class Vehicles extends Register{
	
	private String Oid,enginenumber, bodycolor,rdate,vehicleType;
	private int bodyNumber;
	
	
	Vehicles(int bodyNumber,String Oid,String enginenumber,String bodycolor,String rdate,String vehicleType){
		this.Oid=Oid;
		this.bodyNumber=bodyNumber;
		this.enginenumber=enginenumber;
		this.bodycolor=bodycolor;
		this.rdate=rdate;
		this.vehicleType=vehicleType;
	}
	Vehicles(){
		
	}
        @Override
	public void showInfo() {
		System.out.println(" ---------- Please Enter Vehicle Information ----------- ");
	}
	
	
	public String vehicle() {
		return     "Id Number : "+Oid+"\n"+"Body Number : "+bodyNumber+"\n"+"Engine Number : "+enginenumber+"\n"+"Body Number : "+bodycolor+"\n"+"Registred Date: "+rdate+"\n"+"Vehicle Type : "+vehicleType;
	}
	
	public int Bnumber() {
		return bodyNumber;
	}
	
}
