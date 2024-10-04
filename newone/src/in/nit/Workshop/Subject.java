package in.nit.Workshop;

public class Subject {

	// properties of subject
	public String subjectName;
	public String subjectCode;

	// constructor
	public Subject() {
		System.out.println("default constructor");
	}

	// instance methods
	public void getSubjectDetails() {
		System.out.println("this is getSubjectdetails");
	}

	public void getSubjectDetails(String subjectname) {
		System.out.println("this is getSubjectdetails");
		System.out.println("subjectname:" + subjectname);
	}

	public void getSubjectDetails(String subjectname, String subjectcode) {
		System.out.println("this is getSubjectdetails");
		System.out.println("subjectname:" + subjectname);
		System.out.println("subjectcode:" + subjectcode);
	}

// to get the length oof the given subject
	public void getNumberOfChar(String subjectname) {
		System.out.println("finding the char count");
		System.out.println("subject char count:" + subjectname.length());
	}

	public void getNumberOfChar(String subjectname,String subjectcode) {
		System.out.println("finding the char count");
		System.out.println("subject char count:" + subjectname.length());
		System.out.println("subject char count:" + subjectcode.length());
		
	}

}
