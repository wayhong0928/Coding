package zerojudge;

import java.util.Scanner;
// a011: 00494 - Kindergarten Counting Game
public class Uva00494_A011 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNextLine()) {
			String str = input.nextLine();
			String[] words = str.split("\\W+"); //�Ҧ��D������r�� �Da~z 0~9
			System.out.println(words.length);
		}
		input.close();
	}
}
