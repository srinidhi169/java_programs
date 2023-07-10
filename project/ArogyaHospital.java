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
import java.util.Scanner;
import java.util.*;
class Patient
  {
    private static int  nextId=1;
    private int id;
    private String name;
    private int age;
    private String aadharnumber;
    private String contactnumber;
    private String city;
    private String address;
    private String dateofadimission;
    private String GuardianName;
    private String Guardianaddress;
    private boolean recovered;
    public Patient(String name,int age,String aadharnumber,String contactnumber,String city,String address,String dateofadmission,String GuardianName,String Guardianaddress)
    {
      this.id=nextId++;
      this.name=name;
      this.age=age;
      this.aadharnumber=aadharnumber;
      this.contactnumber=contactnumber;
      this.city=city;
      this.address=address;
      this.dateofadimission=dateofadmission;
      this.GuardianName=GuardianName;
      this.Guardianaddress=Guardianaddress;
      this.recovered=false;
    }
	public static int getNextId() {
		return nextId;
	}
	public static void setNextId(int nextId) {
		Patient.nextId = nextId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getAadharNumber() {
		return aadharnumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharnumber = aadharNumber;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
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
	public String getDateofadimission() {
		return dateofadimission;
	}
	public void setDateofadimission(String dateofadimission) {
		this.dateofadimission = dateofadimission;
	}
	public String getGuardianName() {
		return GuardianName;
	}
	public void setGuardianName(String guardianName) {
		GuardianName = guardianName;
	}
	public String getGuardianaddress() {
		return Guardianaddress;
	}
	public void setGuardianaddress(String guardianaddress) {
		Guardianaddress = guardianaddress;
	}
	public boolean isRecovered() {
		return recovered;
	}
	public void setRecovered(boolean recovered) {
		this.recovered = recovered;
	}
  }
class Hospital
  {
    private HashMap<Integer,Patient>patients;
    public Hospital()
    {
         patients =new HashMap<>();

    }
    public void addPatient(Patient patient)
    {
      patients.put(patient.getId(),patient);
      System.out.println(" patient Added sucessfully");
      }
    public Patient getPatientById(int id)
    {
      return patients.get(id);
    }

    public void allPatientsDetails(){
    boolean check=patients.isEmpty();
    if(check==false){
    Set keys=patients.keySet();
    for(Object obj:keys){
      Integer p1=(Integer)obj;
      Patient p=patients.get(p1);
      System.out.println();
      System.out.println("Patient Id: "+p.getId());
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
    }
    else{
      System.out.println("Collection is Empty");
    }
  }
    public void searchWithId(int id)
    {
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
      System.out.println("invalid id");
    }
  }

    
     public void getpatientsByCity(String city)
    {
    int k=0;
    for(Patient p :patients.values())
      {
        if(p.getCity().equalsIgnoreCase(city))
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
          k++; 
        }
      }
     if(k==0)
        {
          System.out.println("patient not found");
        }
    }
    public void getpatientsByAgeGroup(Integer minAge,Integer maxAge)
  {
    int k=0;
    for(Patient p :patients.values())
      {
        if(p.getAge()>=minAge&&p.getAge()<=maxAge)
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
          k++;
        }
      }
     if(k==0)
        {
          System.out.println("patient not found");
        }
  }

    
    public ArrayList<Patient> getPatientByName(String name)
  { 
    ArrayList<Patient> p11 = new ArrayList<Patient>();
    int k=0;
    for(Patient p:patients.values())
      {
        if(p.getName().equalsIgnoreCase(name))
        { 
          p11.add(p);
          k++;
        }
       
      }
     if(k==0)
        {
          System.out.println("patient not found");
        }
    return p11;
  }

    
    public void dischargePatient(int id){
    Patient p=patients.get(id);
    if(p!=null){
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
    else
      System.out.println("Id Not found");
     
  }

    
    public  void deletePatient(int id)
    {
      Patient p=patients.remove(id);
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
    else
      System.out.println("Id Not found");
     
      }
    }
  

class ArogyaHospital
  {
    public static void main(String []args)
    {
      Hospital hospital=new Hospital();
      Scanner sc=new Scanner(System.in);
       int num=0;
    
    while(num==0){
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("  welcome to ArogyaHospital  ");
        System.out.println("------------------------------");
        System.out.println("1.add patient details");
        System.out.println("2.display all patient details");
        System.out.println("3.patient details by id");
        System.out.println("4.patient details by name");
        System.out.println("5.patient details by age or city");
        System.out.println("6.discharge patient by id");
        System.out.println("7.delete patient by id");
        System.out.println("------------------------------");
        System.out.println("choose one option  ");
        System.out.println("------------------------------");
      int choice=sc.nextInt();
    switch(choice){
        case 1:
       System.out.println("----------------");
       System.out.println("patient details");
       System.out.println("----------------");
       System.out.print("Name:");
      sc.nextLine();
      String name=sc.next();
      System.out.print("age:");
      int age=sc.nextInt();
       sc.nextLine();
      System.out.print("aadhar Number:");
      String aadharnumber=sc.next();
       sc.nextLine();
      System.out.print("contact Number:");
      String contactnumber=sc.next();
       sc.nextLine();
      System.out.print("city:");
      String city=sc.next();
         sc.nextLine();
      System.out.print("address:");
     String address=sc.next();
         sc.nextLine();
      System.out.print("date of adimission:");
      String dateofadimission=sc.next();
         sc.nextLine();
      System.out.print("Guardian Name:");
      String GuardianName=sc.next();
         sc.nextLine();
      System.out.print("Guardian Address:");
      String Guardianaddress=sc.next();
         sc.nextLine();
 Patient p1=new Patient(name,age,aadharnumber,contactnumber,city,address,dateofadimission,GuardianName, Guardianaddress) ;
       
     hospital.addPatient(p1);
       
   
        break;
      case 2:
     hospital.allPatientsDetails();
        break;
      case 3:
        System.out.println("enter the patient id");
        int id=sc.nextInt();
        hospital.searchWithId(id);
        break;
      case 4:
         System.out.println("enter the name of the patient:");
        String name1=sc.nextLine();
       ArrayList<Patient> p11= hospital.getPatientByName(name1);
        for(Patient p111:p11)
          {
           System.out.println();
        System.out.println("Patient Name: "+p111.getName());
        System.out.println("Patient Age: "+p111.getAge());
        System.out.println("Patient Adhar Number: "+p111.getAadharNumber());
        System.out.println("Patient Mobile Number: "+p111.getContactnumber());
        System.out.println("Patient city: "+p111.getCity());
        System.out.println("Patient Address: "+p111.getAddress());
        System.out.println("Date of Admission: "+p111.getDateofadimission());
        System.out.println("Guardian Name: "+p111.getGuardianName());
        System.out.println("Guardian Address: "+p111.getGuardianaddress());
          }
          break;
      case 5:
        System.out.println("----------------");
        System.out.println("1.with city\n2.with age\nselect one option");
        System.out.println("----------------");
        int choose=sc.nextInt();
        switch(choose){
          case 1:
            System.out.println("enter the city");
             String city1=sc.next();
            hospital.getpatientsByCity(city1);
        break;
         case 2:
          System.out.println("enter the minimum age:");
          int minAge=sc.nextInt();
           System.out.println("enter the max age");
           int maxAge = sc.nextInt();
          
          hospital.getpatientsByAgeGroup(minAge,maxAge);
           break;
        }
        break;
      case 6:
        System.out.println("enter the patient id to discharge:");
        int id1=sc.nextInt();
        hospital.dischargePatient(id1);
        System.out.println("------------------------------");
        System.out.println("patient is discharged successfully");
        System.out.println("------------------------------");
        break;
      case 7:
        System.out.println("enter the patient id to delete:");
        int id2=sc.nextInt();
        hospital.deletePatient(id2);
        System.out.println("------------------------------");
        System.out.println("patient is deleted successfully");
        System.out.println("------------------------------");
        break;
        
     
  }
  } 
  }
  }