package in.nit.Workshop;

public class PersonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method is started");
		Person.country="India";
		Person.state="karnataka";
		Person.District="Raichur";
		System.out.println("country is:"+Person.country);
		System.out.println("state is:"+Person.state);
		System.out.println("District is:"+Person.District);
		
		//object creation
		Person person = new Person();
		
		person.personName="Deepak";
		person.qualification="BE";
		person.panCardNumber="12345";
		person.aadharCardNumber="123456879";
		System.out.println("personNameis:"+person.personName);
		System.out.println("qualification:"+person.qualification);
		System.out.println("panCardNumber:"+person.panCardNumber);
		System.out.println("aadharCardNumber:"+person.aadharCardNumber);
		
		
		// invoke the method
		Person.displayInfo();
		person.getInformation();

	}

}
