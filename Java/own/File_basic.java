package own;

import java.io.*;

public class File_basic {

	public static void main(String[] args) throws IOException {
		char data[] = new char[128];
		FileReader fr = new FileReader("D:\\wayhong\\Java\\own\\data.txt");
		int num = fr.read(data);
		String str = new String(data, 0, num);  // �N�r���}�C�ഫ���r��  ����Ÿ� = ��Ӧr��
		System.out.println("Characters tead = " + num);
		System.out.println(str);
		fr.close();
		
		System.out.println("-----write-----");
		
		FileWriter fw = new FileWriter("D:\\wayhong\\Java\\own\\data.txt");  
		// �p�G�[�Wtrue�N���ƪ��[�b�����ƫ᭱�A�u���ɮ׸��| = �мg
		str = "12\n24\n46\n68\n80";
		fw.write(str);
		fw.close();
	}
}
