package own;

import java.util.ArrayList;

public class ArrayList_practice {

	public static void main(String[] args) {
		/*
		 * �B�ʤj�p��Array�A�i�H�H�N���j�p�A�Olist interface ����@
		 * URL�Ghttps://ithelp.ithome.com.tw/articles/10229699
		 * ���X�j�ƹB��Ѧ�Uva00495_C121
		 */
		ArrayList<Integer> arrL = new ArrayList<Integer>(2);
		arrL.add(1);
		arrL.add(2);
		System.out.println(arrL.get(0));
		
		// �ҥ��d�� 16-20
		ArrayList<Integer> list = new ArrayList<Integer>();
		for( int i = 0; i <= 50; i += 10 ) {
			list.add(i);
		}
		list.add(3, 200);
		list.add(0, 300);
		list.add(400);
		System.out.println("�����Ӽ�= " + list.size());
		System.out.println("ArrayList�������G" + list);
		System.out.println("�N���ޭ�1�������H200���N...");
		list.set(1, 200);
		System.out.println("ArrayList�������G" + list);
		System.out.println("�Ĥ@�Ӥ�����200�����ޭ� = " + list.indexOf(200));
		System.out.println("�̫�@�Ӥ����Ȭ�200�����ޭ� = " + list.lastIndexOf(200));
		// for - each
		for( int i : list) {
			System.out.print(i + " ");
		}
	}

}
