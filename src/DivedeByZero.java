import java.util.Scanner;
public class DivedeByZero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.print("�������� �Է��Ͻÿ�:");
		dividend = scanner.nextInt();
		System.out.print("�������� �Է��Ͻÿ�:");
		divisor = scanner.nextInt();
		System.out.println(dividend + "��" + "�� ������ ����" + dividend/divisor + "�Դϴ�.");
		scanner.close();
	}

}
