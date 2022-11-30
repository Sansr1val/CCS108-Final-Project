
public class Program {
	private static int idCounter=1;
	private int id;
	private String name;
	private Curriculum curriculum;
	
	public Program(String name, Curriculum curriculum){
		this.name = name;
		this.curriculum = curriculum;
		this.id = idCounter;
		idCounter++;
	}
	
	public void GetFullDetails() {
		System.out.println("ID: "+id);
		System.out.println("Program Name: "+name);
		System.out.println("Curriculum ID: ");//+curriculum.getID();
	}
	

}
