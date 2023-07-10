/*Arogya is a reputed hospital and it is looking to revamp their aging information management system that is built using an old technology. 
They want a fully web based information system that can handle all their use cases. They have awarded the initial contract to bitLabs, 
and you are the lead Full-Stack Developer. Based on the success of this initial project, Arogya will award additional contracts to bitLabs.

The management system should have the following features:-

Add a patient’s details to the system whenever there is a new patient admitted.

The patient details should include his/her name, age, gender, Aadhar Card number, contact number, city, address, date of admission, guardian's name,
guardian’s address, guardian’s contact number. Assign an unique id to each patient admitted.

The system can show the list of patients at any point of time. Basically the system should be dynamic and a real time system. In other words,
it can provide results at any point of time without any delays.

Given the unique id assigned to a patient, provide all the details of that patient.

In other words, the system should provide details about a patient using his/her unique id or name.

The system can provide the list of all the patients from a particular city or a state. Also provide the list of patients belonging to a particular age group. For example you can be asked to give the list of patients in the age group 50-60.

Mark the patient recovered when he starts working fine.

The system should be able to delete the information of a patient when asked to.  

Implement these features using efficient data structures and OOP concepts learnt in the Java Foundation course. Write clean and organized codes using proper objects and methods.*/

import java.util.*;


class Patient
  {
    private static int pId=1;
    private int id;
    private String name;
    private int age;
    private String gender;
    private long aadharCardNumber;
    private long contactNumber;
    private String city;
    private String address;
    private String dateOfAdmission;
    private String guardianName;
private String guardianAddress;
    private long guardianContactNumber;
    public Patient(String name, int age,String gender, long aadharCardNumber,long contactNumber, String city, String address,String dateOfAdmission,String guardianName,String guardianAddress,long guardianContactNumber)
    { 
      this.id=pId++;
      this.name=name;
      this.age=age;
      this.gender=gender;
      this.aadharCardNumber=aadharCardNumber;
      this.contactNumber=contactNumber;
      this.city=city;
      this.address=address;
      this.dateOfAdmission=dateOfAdmission;
      this.guardianName=guardianName;
      this.guardianAddress=guardianAddress;
      this.guardianContactNumber=guardianContactNumber;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getAadharCardNumber() {
		return aadharCardNumber;
	}
	public void setAadharCardNumber(long aadharCardNumber) {
		this.aadharCardNumber = aadharCardNumber;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDateOfAdmission() {
		return dateOfAdmission;
	}
	public void setDateOfAdmission(String dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getGuardianAddress() {
		return guardianAddress;
	}
	public void setGuardianAddress(String guardianAddress) {
		this.guardianAddress = guardianAddress;
	}
	public long getGuardianContactNumber() {
		return guardianContactNumber;
	}
	public void setGuardianContactNumber(long guardianContactNumber) {
		this.guardianContactNumber = guardianContactNumber;
	}
    public void setId(int id)
   {
     this.id=id;
   }
   public int getId()
   {
     return id;
   }
  }




class Hospital 
  {
     HashMap<Integer,Patient> patients = new HashMap<Integer,Patient>();
    
    public void addPatient(Patient pa)
    {
      patients.put(pa.getId(),pa);
      System.out.println("patient detailes added sucessfully");      
    }
  
   
    public void getAllPatientDetails()
    {
     
      boolean b1 =patients.isEmpty();
      if(b1==false)
      {
        for(Patient o:patients.values())
          {
            System.out.println("Patient details");
            System.out.println("-------------------");
            System.out.println("id = "+o.getId());
            System.out.println("name = "+o.getName());
            System.out.println("age = "+o.getAge());
            System.out.println("gender = "+o.getGender());
            System.out.println("aadharCardNumber = "+o.getAadharCardNumber());
            System.out.println("contactNumber = "+o.getContactNumber());
            System.out.println("city = "+o.getCity());
            System.out.println("address = "+o.getAddress());
            System.out.println("dateOfAdmission = "+o.getDateOfAdmission());
            System.out.println("guardianName = "+o.getGuardianName());
            System.out.println("guardianAddress ="+o.getGuardianAddress());
            System.out.println("guardianContactNumber ="+o.getGuardianContactNumber());
          }
      }
     
      else    
      {
        System.out.println("collection is empty");
      }
    }
     public void patientDetailsbyid(int id){
     Patient p=patients.get(id);
     
    if(p!=null)
    {
      System.out.println();
      System.out.println("Patient Name: "+p.getName());
      System.out.println("Patient Age: "+p.getAge());
      System.out.println("Patient Adhar Number: "+p.getAadharNumber());
      System.out.println("Patient Mobile Number: "+p.getContactnumber());
      System.out.println("Patient city: "+p.getCity());
      System.out.println("Patient Address: "+p.getAddress());
      System.out.println("Date of Admission: "+p.getDateofadimission());
      System.out.println("Guardian Name: "+p.getGuardianName());
      System.out.println("Guardian Address: "+p.getGuardianaddress());
    }
      
  else{
      System.out.println("no patient found");
    }
  }
     
    
    public ArrayList<Patient> patientDetailsbycity(String city){
      ArrayList<Patient> cityList=new ArrayList<Patient>();
     for(Patient p:patients.values()){
       if(p.getCity().equalsIgnoreCase(city))
         cityList.add(p);
     }
      return cityList;
    }

     public ArrayList<Patient> patientDetailsbyage(int age){
      ArrayList<Patient> ageList=new ArrayList<Patient>();
     for(Patient p:patients.values()){
       if(p.getAge()==age)
         ageList.add(p);
     }
      return ageList;
    }
      
}


class ArogyaHospital
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      while(true)
        { 
        System.out.println("------------------------------");
        System.out.println("welcome to ArogyaHospital");
        System.out.println("------------------------------");
        System.out.println("1.add patient details");
        System.out.println("2.patient details by id");
        System.out.println("3.patient details by city");
        System.out.println("4.patient details by age");
        System.out.println("5.delete patient details by id");
        System.out.println("6.display all patient details");
      Hospital hospital=new Hospital();
      
       
      System.out.println("choose the operation to be performed");
      int num = sc.nextInt();
      
      switch(num)
        { 
          case 1 : System.out.println("enter Patient details");
                   System.out.println("-------------------");
                   System.out.print("name:");
                   sc.nextLine();
                   String name=sc.nextLine();
                   System.out.print("age:");
                   sc.nextLine();
                   int age=sc.nextInt();
                   System.out.print("gender:");
                   sc.nextLine();
                   String gender=sc.nextLine();
                   System.out.print("aadhar chard number:");
                   long aadharCardNumber=sc.nextLong();
                   System.out.print("mobile number:");
                   long contactNumber=sc.nextLong();
                   System.out.print("city:");
                   sc.nextLine();
                   String city=sc.nextLine();
                   System.out.print("address:");
                   sc.nextLine();
                   String address=sc.nextLine();
                   System.out.print("date of admission:");
                   sc.nextLine();
                   String dateOfAdmission=sc.nextLine();
                   System.out.print("guardian name:");
                   sc.nextLine();
                   String gaurdianName=sc.nextLine();
                   System.out.print("guardian address:");
                   sc.nextLine();
                   String gaurdianAddress=sc.nextLine();
                   System.out.print("guardian number:");
                   long gaurdianContactNumber=sc.nextLong();
                   Patient p=new Patient(name,age,gender,aadharCardNumber,contactNumber,city,address,dateOfAdmission,gaurdianName,gaurdianAddress,gaurdianContactNumber);
                  hospital.addPatient(p);
            break;
          case 2 :
             hospital.patientDetailsbyid(6);
             break;
          case 3 :
            System.out.println("enter the city:");
            String entercity= sc.nextLine();
            hospital.patientDetailsbycity(entercity);
            break;
          case 4 :
            System.out.println("enter the age:");
            int enterage= sc.nextInt();
            
            hospital.patientDetailsbyage(enterage);
            break;
          case 6 :
            hospital.getAllPatientDetails();
            break;
    }
  }
  }
  }