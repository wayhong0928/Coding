import java.util.Scanner;

public class test {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double tem[][] = {
			{18.2, 17.3, 15.0, 13.4},
			{23.8, 25.1, 20.6, 17.8},
			{20.6, 21.5, 18.4, 15.7}
		};
		double avgday[] = new double[4], avgtime[] = new double[3]; // �C�饭��  �C�ɬq����
		double maxtem = 0, maxday = 0, maxtime = 0,mintem = 50, minday = 0, mintime = 0; // �ū׳̰��̧C����l�P�ɬq
		System.out.println("\t�P���@\t�P���G\t�P���T\t�P���|");
		for(int i = 0; i < 3; i++) {
			System.out.print("�ɬq" + (i + 1) + "\t");
			for(int j = 0; j < 4; j++) {
				System.out.print(tem[i][j] + "\t");
				avgday[j] += tem[i][j];
				avgtime[i] += tem[i][j];
				if(tem[i][j] > maxtem) {
					maxtem = tem[i][j];
					maxday = j;
					maxtime = i;
				}
				if(tem[i][j] < mintem) {
					mintem = tem[i][j];
					minday = j;
					mintime = i;
				}
			}
			System.out.println("");
		}
		for(int i = 0; i < 4; i++) {
			System.out.println((avgday[i] / 3) + " ");
		}
		for(int i = 0; i < 3; i++) {
			System.out.println((avgtime[i] / 4) + " ");
		}
		System.out.println((maxday + 1) + " " + (maxtime + 1));
		System.out.println((minday + 1) + " " + (mintime + 1));
	}
}