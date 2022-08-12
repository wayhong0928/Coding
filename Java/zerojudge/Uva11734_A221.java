package zerojudge;

import java.util.*;

// a221: 11734 - Big Number of Teams will Solve This
public class Uva11734_A221 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = Integer.parseInt(input.nextLine());  // �n�⴫��Ÿ�Ū�i�ӦA��r����int
		String a = "", b = "";
		for( int i = 0 ; i < t ; i++ ) {
			a = input.nextLine();
			b = input.nextLine();
			System.out.print("Case " + ( i + 1 ) + ": ");
			if( a.equals(b)) { // �p�G���@�˷�M�Nyes
				System.out.println("Yes");
			} else {
				a = a.trim(); // �r��h�Y�h��(�ťժ�����)
				b = b.trim();
				boolean check = false;
				int a1 = 0, b1 = 0; // �ˬd��m�� 
				while(a1 != a.length() || b1 != b.length()) {
					if(a1 == a.length()) a1 -= 1; // ����䤤�@��string����
					if(b1 == b.length()) b1 -= 1;
					
					if(a.charAt(a1) == ' ') {
						a1++; // �J��ťմN���L
					} else if(b.charAt(b1) == ' ') {
						b1++; // �J��ťմN���L
					} else if(a.charAt(a1) != b.charAt(b1)) {
						check = true; // �N���e���@�� WA~
						break;
					} else {
						a1++; // �ثe��Ƴ��@�� �~����next char
						b1++;
					}
				}
				if(check == true) {
					System.out.println("Wrong Answer");
				} else {
					System.out.println("Output Format Error");
				}
			}
			/*
			// replace�g�k
			if(a.equals(b)) {
				System.out.println("Yes");
			} else {
				a = a.replace(" ", "");
				b = b.replace(" ", "");
				if(a.equals(b)) {
					System.out.println("Output Format Error");
				} else {
					System.out.println("Wrong Answer");
				}
			}
			*/
		}
		input.close();
	}
}
