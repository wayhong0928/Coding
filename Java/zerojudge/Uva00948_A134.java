package zerojudge;

import java.util.Scanner;
// a134: 00948 - Fibonaccimal Base
public class Uva00948_A134 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int test = 0;
		boolean check = false; //�ˬd��
		String ans = ""; // ����
		// �إ߶O���ƦC��A�D�س̦h����100, 000, 000
		int[] f = new int[40];
		f[0] = 0;
		f[1] = 1;
		for( int i = 2; i < 40 ; i++ ) {
			f[i] = f[i-1] + f[i-2];
		}
		// �ت��� �}�lŪ���
		while(n > 0) {
			ans = "";
			test = input.nextInt();
			System.out.print(test);
			// �Ѥj��p�u�ʷj�M
			for( int i = 39; i > 1 ; i-- ) {
				// �p�Gtest > �O���ƦC���� �ӥB�W�@�ӼƦr�S���ŦX�e��������N�}��
				if(test >= f[i] && check == false) {
					ans += "1";
					test -= f[i];
					// �]�w bool �U�@�ӼƦr�N�|��else����
					check = true;
				} else {
					check = false;
					// �Ĥ@�Ӥ@�w�O1 �ҥH ans �p�G�٬O�ŭȳ�����[�W0
					if(ans != "") ans += "0";
				}
			}
			System.out.println(" = " + ans + " (fib)");
			n--;
		}
		input.close();
	}
}
