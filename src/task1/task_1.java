package task1;

import java.util.Scanner;

public class task_1 {
	public static void main(String[] args) {
		
		System.out.println("�������ѯ��ֵ");

		Scanner sc = new Scanner(System.in);

		int targe = sc.nextInt();

		int[] array = {10,20,30,40,50,60,70,80,90,100};

		int start = 0;

		int end = array.length-1;

		
		int targeindex = -1;

		while(start<=end) {

			int mid = (start+end)/2;

			if(array[mid]==targe) {

				targeindex=mid;

				break;

			}

			else if(array[mid]<targe) {

				start = mid + 1;

			}else if (array[mid]>targe) {

				end = mid -1 ;

			}

		}

		if(targeindex!=-1) {

			System.out.println("���ҵ�Ŀ��Ԫ����"+targe+"���ҵ�����λ��"+targeindex);

		}else {

			System.out.println("���ҵ�Ŀ��Ԫ����"+targe+"û���ҵ�����λ��");

		}

	}
		/*int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println("������1-15��ֵ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < array.length; i++) {
			if(array[i]==num) {
				System.out.println("�±���"+i);
			}
		}*/

	}
	

