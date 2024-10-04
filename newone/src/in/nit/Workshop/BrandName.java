package in.nit.Workshop;

public class BrandName {
  public static void main(String args[]) {
	  String names[]= {"Puma","Bata","Mrf"};
	  System.out.println("names:"+names.length);
	  
	  for(int index=0; index<names.length; index++) {
		  System.out.println(names[index]);
		  
	  }
	  System.out.println("reversing the elements");
	  for(int index=names.length-1; index>=0; index--) {
		  System.out.println(names[index]);
	  }
	  int numbers[]= {1,2,3,4,5};
	  int sum=0;
	  for(int index=0; index<numbers.length; index++) {
		  System.out.println(numbers[index]);
		   sum=sum+numbers[index];
		  
	  }
	  System.out.println(sum);
	 
	  for(int index=0; index<numbers.length; index++) {
		  System.out.println(numbers[index]*numbers[index]);
		 
		  
	  }
	  
	  for(int index=0; index<numbers.length; index++) {
	  System.out.println(numbers[index]*numbers[index]*numbers[index]);
	  }

	  for(int index=0; index<numbers.length; index++) {
		  if (numbers[index]%2==0) {
			  
		  
		  System.out.println("it is even number="+numbers[index]);
	  } else {
		  }
	  }
	  
	  
}
}
