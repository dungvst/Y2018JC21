package Phamduydieu;

import java.util.Scanner;

public class BTVN_MayTinh {

	private static Scanner sc;

	public static void main(String[] args) {
sc = new Scanner(System.in);
		System.out.println("MỜI BẠN NHẬP DỮ LIỆU");
		System.out.print("Số a: ");
		float a = sc.nextFloat();
		System.out.print("Số b: ");
		float b = sc.nextFloat();
		System.out.println("MỜI BẠN NHẬP PHÉP TOÁN:\n 1: Phép Cộng\n 2: Phép Trừ\n 3: Phép Nhân\n 4: Phép Chia");
		int pheptoan = sc.nextInt();
		float cong = a+b;
		float tru = a-b;
		float nhan = a*b;
		if(pheptoan == 1)
		{
			System.out.println("a + b = "+ cong);
		}
		else
			if(pheptoan == 2)
			{
				System.out.println("a - b = "+ tru);
			}
			else
				if(pheptoan == 3)
				{
					System.out.println("a * b = "+ nhan);
				}
				else
					if(pheptoan == 4)
					{
						if(b==0)
						{
							if(a==0)
							{
								System.out.println("Result of function is underfined");
							}
							else
								System.out.println("Cannot divide by zero");
						}
						else
							System.out.println("a / b = " + a/b);
					}
					else
						System.out.println("You did not choose calculation");
	}
}
