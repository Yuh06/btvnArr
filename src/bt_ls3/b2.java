package bt_ls3;

import java.util.Scanner;

public class b2 {
	public static void main(String[] args) {
		totalMoney();
}
	public static void totalMoney() {
		double[] arr= {1.549,1.600,1.857,2.340,2.615,2.701};
		int e;
		do {
			System.out.println("Nhap dien tieu thu :");
			Scanner sc = new Scanner(System.in);
			 e = sc.nextInt();
		} while (e<0);
		totalMoney(e,arr);
	}
	
		private static void totalMoney(int e, double[] arr) {
		// TODO Auto-generated method stub
		double sum = 0;
		if(e<=50) {
			sum = arr[0]*e;
		}
		else if(e<=100) {
			sum = arr[1]*e;
		}
		else if(e<=200) {
			sum = arr[2]*e;
		}
		else if(e<=300) {
			sum = arr[3]*e;
		}
		else if(e<=400) {
			sum = arr[4]*e;
		}
		else if(e>400) {
			sum = arr[5]*e;
		}
		System.out.println("Tong tien dien la :" + sum);
	}
}