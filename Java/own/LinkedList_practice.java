package own;

import java.util.LinkedList;

public class LinkedList_practice {
	public static void main(String[] args) {
		// LinkedList �ҥ� 16-16
		LinkedList<Integer> list = new LinkedList<Integer>();
		for( int i = 0; i <= 30; i += 10 ) {
			list.add(i);
		}
		list.addFirst(100);
		list.addLast(200);
		list.addFirst(300);
		
		System.out.println("�����ӼơG " + list.size());
		System.out.println("LinkedList�������G ");
		for( int i = 0; i < list.size(); i++ ) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.print("\n�R���̫�@�Ӥ���");
		System.out.println(list.removeLast() + "...");
		System.out.println("�Ĥ@�Ӥ����G" + list.getFirst());
		System.out.println("�̫�@�Ӥ����G" + list.getLast());
		System.out.println("�����Ȭ�200�����ޭȡG" + list.indexOf(200));
	}

}
