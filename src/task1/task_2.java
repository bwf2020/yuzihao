package task1;

import java.util.Scanner;

public class task_2 {
	public static void main(String[] args) {
		//���������һ�¼۸�
		float[] price = new float[5]  ;
		int num;
		//������Ʒ
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ʒ��Ϣ:\0 ����\0 ����");
		System.out.println("��������Ʒ������");
		String name = sc.nextLine();
		if("����".equals(name)) {
			price[0]=5.8f;
		}
		System.out.println("����");
		num = sc.nextInt();
		//���׼۸��������
		float all = price[0]*num;
		System.out.println("���׼۸���"+all);
		//������Ʒ
		Scanner sc1 = new Scanner(System.in);
		System.out.println("���ٴ�������Ʒ������");
		
		String name2 = sc1.nextLine();
		if("����".equals(name2)) {
			price[1]=8.9f;
		}
		System.out.println("����");
		num = sc1.nextInt();
		//���Ӽ۸��������
		float all2 = price[1]*num;
		System.out.println("���Ӽ۸���"+all2);
		
		System.out.println("���������");
		//��Ʒ������ӳ�0.8
		float allprice=(float) ((all+all2)*0.8);
		//�����payment
		System.out.println("�Ҹ������Ǯ");
		int payment = sc.nextInt();
		//����givechange
		float givechange = payment - allprice; 
		System.out.println("����"+givechange);
		
		
		
		
		
		
	}

}
