class Personuc {
	String name;
	String id;
	
	public Personuc(String name) {
		this.name = name;
	}
}

class Studentuc extends Personuc {
	String grade;
	String department;
	
	public Studentuc (String name) {
		super(name);
	}
}
public class UpcastingEx {

	public static void main(String[] args) {
		Personuc p;
		Studentuc s = new Studentuc ("º€¡§»Ø");
		p = s;
		
		System.out.println(p.name);

	}

}
