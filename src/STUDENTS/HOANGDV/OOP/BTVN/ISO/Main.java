package HOANGDV.OOP.BTVN.ISO;

public class Main extends ChuanISO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Chọn tên các băng tần cần đăng ký");
		System.out.println("1 - CDMA");
		System.out.println("2 - WCDMA");
		System.out.println("3 - GSM");
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int select = scan.nextInt();
		switch (select) {
		case 1:
			System.out.println("Tần số là: "+new Main().bangTan("CDMA"));
			break;
		case 2:
			System.out.println("Tần số là: "+new Main().bangTan("WCDMA"));
			break;
		case 3:
			System.out.println("Tần số là: "+new Main().bangTan("GSM"));
			break;
		default:
			new Main().bangTan("No selection");
			break;
		}
		scan.close();
	}

	@Override
	public String bangTan(String bt) {
		// TODO Auto-generated method stub
		String re = "";
		switch (bt) {
		case "CDMA":
			re = "900 Mhz � 902 Mhz";
			break;
		case "WCDMA":
			re = " 903 Mhz � 905 Mhz";
			break;
		case "GSM":
			re = "906 Mhz � 908 Mhz";
			break;
		}
		return re;
	}

}
