import java.util.Scanner;
class Booka{
	String title, author;
	public Booka(String title, String author) {
		this.title = title;
		this.author = author;
	}
}
public class BookArray {
		public static void main(String[] args) {
		Booka [] booka = new Booka[2];
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<booka.length;i++) {
			System.out.print("제목>>");
			String title = scanner.nextLine();
			System.out.print("저자>>");
			String author = scanner.nextLine();
			booka[i] = new Booka(title,author);
		}
		for(int i=0; i<booka.length;i++)
			System.out.print("(" + booka[i].title + "," + booka[i].author + ")");
	
		scanner.close();
		}

}
