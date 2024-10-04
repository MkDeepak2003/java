package in.nit.Workshop;

public class SubjectRunner {
	public static void main(String args[]) {
		Subject subject = new Subject();
		subject.getSubjectDetails();
		subject.getSubjectDetails("maths");
		subject.getSubjectDetails("maths","21ec98");
		subject.getNumberOfChar("Faizan ahmed");
		subject.getNumberOfChar("maths","21ec98");
		subject.getnumberOfWords("faizan is good boy");
		subject.getnumberOfWords("HOW ARE YOU FAIZAN");
		subject.getnumberOfWords("how are you faizan");
		
		
		
	}

}
