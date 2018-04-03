package HOANGDV.OOP.TRUUTUONG;

public class ITStudent extends Student {

	private int diemJava;
	private int diemCss;

	@Override
	double tinhDiemTB() {
		// TODO Auto-generated method stub
		return (diemJava * 2 + diemCss) / 3;
	}

}
