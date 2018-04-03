package Phamduydieu.QuanLySach;

public class MainQuanLySach {

	public static void main(String[] args) {
		Cong c = new Cong();
		c.setA(5);
		c.setB(7);
		System.out.println("Cộng: "+ c.cong());
		System.out.println("Trừ: "+ c.tru());
		System.out.println("Nhân: "+ c.nhan());
		System.out.println("Chia: "+ c.chia());
	}

}
