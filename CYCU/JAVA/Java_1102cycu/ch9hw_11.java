import java.util.Scanner;
//9_11
class CRational {
	public int n, d;
	public void setND(int num, int den) {
		n = num;
		d = den;
	}
	public CRational add(CRational r) { // �[�k ���l:������l*�����ۥ[ ����:�����ۭ�
		show(this, r, '+');
		CRational ans = new CRational();
		ans.n = this.n * r.d + this.d * r.n;
		ans.d = this.d * r.d;
		return ans;
	}
	public CRational sub(CRational r) { // ��k ���l:������l*�����۴� ����:�����ۭ�
		show(this, r, '-');
		CRational ans = new CRational();
		ans.n = this.n * r.d - this.d * r.n;
		ans.d = this.d * r.d;
		return ans;
	}
	public CRational mul(CRational r) { // ���k
		show(this, r, '*');
		CRational ans = new CRational();
		ans.n = this.n * r.n;
		ans.d = this.d * r.d;
		return ans;
	}
	public CRational div(CRational r) { // ���k ���˼�
		show(this, r, '/');
		CRational ans = new CRational();
		ans.n = this.n * r.d;
		ans.d = this.d * r.n;
		return ans;
	}
	public void show(CRational a, CRational b, char c) { // print a=�Ĥ@�դ��� b=�ĤG�� c=�B��Ÿ�
		System.out.print("(" + a.n + "/" + a.d + ")" + c + "(" + b.n + "/" + b.d + ") = ");
	}
}

public class ch9hw_11 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		CRational a = new CRational();
		CRational b = new CRational();
		CRational c;
		a.setND(2, 5);  // �o�դ��Ʀۤv�]�w
		b.setND(3, 6);  // �o�դ��Ʀۤv�]�w
		c = a.add(b);
		show(c);
		c = a.sub(b);
		show(c);
		c = a.mul(b);
		show(c);
		c = a.div(b);
		show(c);
	}
	public static void show(CRational obj) {
		System.out.println(obj.n + "/" + obj.d);
	}
}