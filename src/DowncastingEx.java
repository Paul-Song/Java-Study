class Persondc {
	String name;
	String id;
	
	public Persondc(String name) {
		this.name = name;
	}
}

class Studentdc extends Persondc {
	String grade;
	String department;
	
	public Studentdc (String name) {
		super(name);
	}
	public void Gradedc() {
		System.out.println(grade);
	}
}
public class DowncastingEx {

	public static void main(String[] args) {
		Persondc p = new Studentdc("º€¡§»Ø");
		Studentdc s;
		
		s = (Studentdc)p;
		
		System.out.println(s.name);
		s.grade = "A";
		s.Gradedc();

	}

}
