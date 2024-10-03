package in.nit.java_workshop;

public class UserDetailsRunner {
	
	public static void main(String[] args) {
  System.out.println("main method started");
  
  
     UserDetails deepak= new UserDetails();
     System.out.println("user deatails:"+deepak);
     deepak.userId=18;
     deepak.userName="deepak";
     deepak.age=21;
     deepak.dateOfBrith="06/10/2003";
     deepak.gender="male";
     deepak.userEmailId="mkmkdeepak657@gmail.com";
     deepak.password="faizan";
     System.out.println("userame:"+deepak.userName);
     System.out.println("userId:"+deepak.userId);
     System.out.println("age:"+deepak.age);
     System.out.println("dateOfBrith:"+deepak.dateOfBrith);
     System.out.println("gender:"+deepak.gender);
     System.out.println("userEmailId:"+deepak.userEmailId);
     System.out.println("password:"+deepak.password);
}
}