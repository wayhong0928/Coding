import java.util.Scanner;

public class hw0425 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int num[][] = {
			{33, 32, 56, 45, 33},
			{77, 33, 68, 45, 23},
			{43, 55, 43, 67, 65}
		};
		int price[] = {12, 16, 10, 14, 15};
		int sums[] = new int[3]; // �P����P���`���B
		int sump[] = new int[5]; // ���~�P���`���B
		int maxs = 0, maxp = 0; // �~�Z�̦n�P���  �P����B�̦h���~
		int cks = 0, ckp = 0;  //���
		System.out.println("�P���	���~A	���~B	���~C	���~D	���~E	total");
		for(int i = 0; i < 3; i++) {
			System.out.print("    " + (i+1) + "\t");
			for(int j = 0; j < 5; j++) {
				System.out.print(num[i][j] + "\t");
				sums[i] += num[i][j] * price[j];
				sump[j] += num[i][j] * price[j];
			}
			System.out.println(sums[i]);
			if(sums[i] > maxs) {
				maxs = sums[i];
				cks = i;
			}
		}
		System.out.println("------------------------------------------------------------------");
		System.out.print("  total\t");
		for(int i = 0; i < 5; i++) {
			System.out.print(sump[i] + "\t");
			if(sump[i] > maxp) {
				maxp = sump[i];
				ckp = i;
			}
		}
		System.out.println("");
		System.out.println("�~�Z�̦n���P��� = " + (cks + 1));
		System.out.println("�~�Z�̦n�����~�O = " + (char)(ckp + 65));
	}
}