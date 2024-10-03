package in.nit.Workshop;

public class Person {

         //static variables
	     public static String country;
	     public static String state;
	     public static String District;
	     
	     //instance variables or non static variables
	     public String personName;
	     public String qualification;
	     public String panCardNumber;
	     public String aadharCardNumber;
	       
	     
              // static methods
	     public static void displayInfo() {
	    	 System.out.println("display method is invoked");
	     }    	 
	    	 
	    	 
	    	 // non static methods
	    public void getInformation() {
	         System.out.println("invoking non static method");
	    }

	    
	    
	    
	    
	    
	    
	    
}
