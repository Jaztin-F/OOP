package oop;

import java.util.*;
public class OOP {
	public static void main(String args[]) {
		
		
		List<Toda> t=new ArrayList<>();
		List<Vehicles> t1=new ArrayList<>();
		List<Owners> t2=new ArrayList<>();
	
		Scanner sc=new Scanner(System.in);
                
		int num;

		do {
			
			System.out.println("1. Display Information of The Toda");
			System.out.println("2. Display Information of The Vehicle");
			System.out.println("3. Display Information of The Owner");
			System.out.println("4. Register Here");
			System.out.println("5. Search for Information");
			System.out.println("6. Exit");
			
                        
			System.out.print("Enter Your Choice : "); 
			 num=sc.nextInt();
			 
			 
			 switch(num) {
 
			 case 1:
				 
				 System.out.println("-------------------------------------------");
				
				 
				 Iterator<Toda> it=t.iterator();
					
					while(it.hasNext()) {
					
						System.out.println(it.next().toda());
						
					}
					 System.out.println("-------------------------------------------");
				 
				 break;
			 case 2:
				 System.out.println("-------------------------------------------");
				 Iterator<Vehicles> its=t1.iterator();
					
					while(its.hasNext()) {
						System.out.println(its.next().vehicle());
					}
					 System.out.println("-------------------------------------------");
                                         
				 break;
			 case 3:
				 System.out.println("-------------------------------------------");
					Iterator<Owners> ito=t2.iterator();
					while(ito.hasNext()) {
						
						System.out.println(ito.next().owner());
					}
					 System.out.println("-------------------------------------------");
				 break;
			 case 4:
				 Register r=new Toda();
					r.showInfo();
					System.out.print("Enter Costumer Number : ");
					int ids=sc.nextInt();
					sc.nextLine();
					System.out.print("Enter Name Of toda : ");
					String nameoftoda=sc.nextLine();
					System.out.print("Enter Cellphone number : ");
					String cellphonenumber=sc.nextLine();
					System.out.print("Enter Email : ");
					String email=sc.nextLine();
					System.out.print("Enter Contact Person: ");
					String contactperson=sc.nextLine();
					System.out.print("Enter Address : ");
					String address=sc.nextLine();
					
                                  Toda to=new Toda(ids,nameoftoda,cellphonenumber,email,contactperson,address);
                                    t.add(to);
				
				
                                 Register v=new Vehicles();
                                 v.showInfo();
                                     System.out.print("Enter Owner's Id : ");
                                     String Oid=sc.nextLine();
                                     System.out.print("Enter Body NUmber : ");
                                     int bodyNumber=sc.nextInt();
                                     sc.nextLine();
                                     System.out.print("Enter Engine NUmber : ");
                                     String enginenumber=sc.nextLine();                        
                                     System.out.print("Enter Body Color : ");
                                     String bodycolor=sc.nextLine();                        
                                    System.out.print("Enter Registration Date : ");
                                    String rdate=sc.nextLine();
                                    System.out.print("Enter Vehicle Type : ");
                                    String vehicletype=sc.nextLine();
                
                            Vehicles ve=new Vehicles(bodyNumber,Oid,enginenumber,bodycolor,rdate,vehicletype);
                              t1.add(ve);
                
                                     Register ow=new Owners();
                                     ow.showInfo();
                                     
                                     System.out.print("Enter Owner's Id : ");
                                     int ido=sc.nextInt();
                                     sc.nextLine();
                                    System.out.print("Enter Firstname : ");
                                    String firstname=sc.nextLine();
                                    System.out.print("Enter Lastname : ");
                                    String lastname=sc.nextLine();
                                    System.out.print("Enter Gender : ");
                                    String gender=sc.nextLine();
                                    System.out.print("Enter Date Of bith : ");
                                    String dateofbirth=sc.nextLine();
                                    System.out.print("Enter Address : ");
                                    String aaddress=sc.nextLine();
				
				
                                Owners own= new Owners( ido,firstname,lastname,dateofbirth,aaddress,gender);
                                t2.add(own);
                                break;
				 
                    case 5:
			 
				 
				 char you;
				 System.out.println("A. Search For Toda");
				 System.out.println("B. Search For Vehicle");
                                 System.out.println("C. Search For Owner");
                                 System.out.println("D. Exit");
				 System.out.print("Your Choice PLease : ");
				 you=sc.next().charAt(0);
			
				
				 do{
			
					
					
					 switch(Character.toUpperCase(you)) {
					 case 'A':
						 boolean finding=false;
						 	 System.out.print("Enter The Costumer Number : ");
						 	 ids=sc.nextInt();
						 it=t.iterator();
						 while(it.hasNext()) {
							 Toda a=it.next();
							 if(a.Cnumber()==ids) {
								 System.out.println(a.toda());
								 finding=true;
							 }
						 }
						 if(!finding) {
							 System.out.println("Record is Not Here :");
						 }
						 break;
					 case 'B':
						 
						 boolean search=false;
						System.out.print("Enter The Body Number : ");
						bodyNumber=sc.nextInt();
						 its=t1.iterator();
						 
						 
						 while(its.hasNext()) {
							 Vehicles a=its.next();
							 if(a.Bnumber()==bodyNumber) {
								 System.out.println(a.vehicle());
								 search=true;
							 }
						 }
						 if(!search) {
							 System.out.println("Record is Not Here :"); 
						 }
						 break;
						 
					 case 'C':
						 boolean searching=false;
						 
						 System.out.print("Enter Owner's ID : ");
						 ido=sc.nextInt();
						 ito=t2.iterator();
						 
						 while(ito.hasNext()) {
							 Owners a=ito.next();
							 if(a.ID()==ido) {
								 System.out.println(a.owner());
								 searching =true;
							 }
						 }
						 if(!searching) {
							 System.out.println("Record is Not Here :"); 
						 }
					 
					 break;
					 case 'D':
						 System.out.println("Please Proceed!!!!");
						 break;
					 
					 default:
						 System.out.println("Try Again!!!!!!!");
						 break;
					 }
					 
					 
				 }while(Character.toUpperCase(you)!='D');
				
			 break;
				 
			 case 6:
				 
				 System.out.println("Thank You Very Much!!!!!!!!!!!");
				 break;
				 
				 default:
					 System.out.println("PLease Try Again!!!!");
					 break;
			 }
		}while(num!=6);
		
    }
}