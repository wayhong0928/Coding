package own;

import java.io.*;

public class File_stream {

	public static void main(String[] args) throws IOException {
		System.out.println("-----File Input Stream-----");
		FileInputStream fi = new FileInputStream("D:\\wayhong\\Java\\own\\data.txt");
		System.out.println("file size = " + fi.available());
		byte ba[] = new byte[fi.available()]; // �إ� byte �}�C
		fi.read(ba); // �NŪ�������e�g��}�C ba ��
		System.out.println(new String(ba)); // �L�X�}�C ba �����e
		fi.close();
		
		System.out.println("-----File Output Stream-----");
		// �ҥ�14-16�� ��gif���ܽd
	}
}
