package own;

import java.io.*;

public class File_buffered {
	public static void main(String[] args) throws IOException {
		System.out.println("-----BufferedReader-----");
		String str = "";
		FileReader fr = new FileReader("D:\\wayhong\\Java\\own\\data.txt");
		BufferedReader bfr = new BufferedReader(fr);
		int count = 0;
		while((str = bfr.readLine()) != null) { // �C��Ū���@��A����EOF
			count++;
			System.out.println(str);
		}
		System.out.println(count + " lines read");
		fr.close();
		bfr.close();
		
		System.out.println("-----BufferedWriter-----");
		
		FileWriter fw = new FileWriter("D:\\wayhong\\Java\\own\\data.txt");
		BufferedWriter bfw = new BufferedWriter(fw);
		for( int i = 0; i <= 5; i++ ) {
			bfw.write(Double.toString(Math.random())); // �g�J�üƨ�w�İ�
			bfw.newLine();
		}
		bfw.flush();  // �N�w�İϤ�����Ƽg���ɮ׸�
		bfw.close();
		fw.close();
	}
}
