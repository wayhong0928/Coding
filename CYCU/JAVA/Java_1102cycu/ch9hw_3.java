import java.util.Scanner;

class Caaa {
	private int value;
	public Caaa() {
		//���D�g���B���{���X�A�ϱo�I�s���غc���ɡAvalue���ȷ|�Q�]��10
		this.value = 10;
		System.out.println("value = " + value);
	}
	public Caaa(int i) {
		value = i;
		System.out.println("value = " + value);
	}
}

public class ch9hw_3 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Caaa obj1 = new Caaa();
		Caaa obj2 = new Caaa(12);
	}
}