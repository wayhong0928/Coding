import java.util.Scanner;

class Ctest {
	void show(int number) {
		if(number < 0) {
			System.out.println("���Ƭ��t��");
		} else if(number > 0) {
			System.out.println("���Ƭ�����");
		} else {
			System.out.println("���O���Ƥ]���O�t��");
		}
	}
}

public class ch8hw_8 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Ctest test = new Ctest();
		test.show(-4);
		test.show(8);
		test.show(0);
	}
}