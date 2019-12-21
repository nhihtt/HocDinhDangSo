package tonhi.com;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestDinhDangSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Mời bạn nhập vào điểm toán:");
		double toan =sc.nextDouble();
		System.out.println("Mời bạn nhập vào điểm lý :");
		double ly =sc.nextDouble();
		System.out.println("Mời bạn nhập vào điểm hóa :");
		double hoa =sc.nextDouble();
		double dtb= (toan+ly+hoa)/3;
		System.out.println("DTB="+dtb);
		DecimalFormat dcf =new DecimalFormat("#.##");
		System.out.println("DTB="+dcf.format(dtb));
	}

}
