package task1;

import java.util.Scanner;

public class task_1 {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println("请输入1-15的值");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < array.length; i++) {
			if(array[i]==num) {
				System.out.println("下标是"+i);
			}
		}

	}
	
}
