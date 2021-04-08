package task1;

import java.util.Scanner;

public class task_2 {
	public static void main(String[] args) {
		//建个数组存一下价格
		float[] price = new float[5]  ;
		int num;
		//手套商品
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入商品信息:\0 手套\0 袜子");
		System.out.println("请输入商品的名称");
		String name = sc.nextLine();
		if("手套".equals(name)) {
			price[0]=5.8f;
		}
		System.out.println("几件");
		num = sc.nextInt();
		//手套价格乘以数量
		float all = price[0]*num;
		System.out.println("手套价格是"+all);
		//袜子商品
		Scanner sc1 = new Scanner(System.in);
		System.out.println("请再次输入商品的名称");
		
		String name2 = sc1.nextLine();
		if("袜子".equals(name2)) {
			price[1]=8.9f;
		}
		System.out.println("几件");
		num = sc1.nextInt();
		//袜子价格乘以数量
		float all2 = price[1]*num;
		System.out.println("袜子价格是"+all2);
		
		System.out.println("今天活动打八折");
		//商品两件相加乘0.8
		float allprice=(float) ((all+all2)*0.8);
		//付款定义payment
		System.out.println("我付款多少钱");
		int payment = sc.nextInt();
		//找零givechange
		float givechange = payment - allprice; 
		System.out.println("找零"+givechange);
		
		
		
		
		
		
	}

}
