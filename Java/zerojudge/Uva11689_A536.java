package zerojudge;

import java.util.*;
//a536: 11689 - Soda Surpler
public class Uva11689_A536 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int e = 0, f = 0, c = 0, ans = 0, k = 0; 
		// �@�}�l�֦����Ų~�l�B�o�Ѧ����쪺�Ų~�l�B�h�֪Ų~�i�H���@�~�s�T���B�i�H�ܨ�h�ֲ~�T���B���U�p���
		while(n > 0) {
			ans = 0;
			e = input.nextInt();
			f = input.nextInt();
			c = input.nextInt();
			e += f;
			while(e >= c) {
				k = e;
				e /= c;
				ans += e;
				e += k % c;
			}
			System.out.println(ans);
			n--;
		}
		input.close();
	}
}
