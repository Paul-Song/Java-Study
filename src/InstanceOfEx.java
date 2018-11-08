class Personi {}
class Studenti extends Personi {}
class Researcheri extends Personi {}
class Professori extends Researcheri {}

public class InstanceOfEx {
	static void print(Personi p) {
		if(p instanceof Personi)
			System.out.print("Person ");
		if (p instanceof Studenti)
			System.out.print("Student ");
		if(p instanceof Researcheri)
			System.out.print("Researcher ");
		if(p instanceof Professori)
			System.out.print("Professor ");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Studenti() ->\t"); print(new Studenti());
		System.out.print("new Researcheri() ->\t"); print(new Researcheri());
		System.out.print("new Professori() -> \t"); print(new Professori());

	}

}
