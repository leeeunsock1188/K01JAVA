package common;

public class Teacher extends Person{
	String subject;	//담당과목 
	
	public Teacher(String n ,int a , String subject) {
		super(n, a);
		this.subject = subject;
		
	}

	
	public String getSubject() {
		return String.format("%s,과목:%s", super.getInfo(), subject);
	}

	@Override
	public void showInfo() {
		
		super.showInfo();
	}
	

}
