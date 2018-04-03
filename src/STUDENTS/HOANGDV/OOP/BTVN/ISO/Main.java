package HOANGDV.OOP.BTVN.ISO;

public class Main extends ChuanISO{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().bangTan("CDMA");
	}

	@Override
	public String bangTan(String bt) {
		// TODO Auto-generated method stub
		String re = "";
		switch (bt) {
		case "CDMA":
			re = "900 Mhz – 902 Mhz";
			break;
		case "WCDMA":
			re = " 903 Mhz – 905 Mhz";
			break;
		case "GSM":
			re = "906 Mhz – 908 Mhz";
			break;
		}
		return re;
	}

}
