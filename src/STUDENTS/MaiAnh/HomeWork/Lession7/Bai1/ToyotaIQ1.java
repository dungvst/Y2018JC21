package MaiAnh.HomeWork.Lession7.Bai1;

public class ToyotaIQ1 extends ToyotaIQ{
	private String phuKien;

	public ToyotaIQ1() {
		super();
		this.phuKien ="    - Gương điều Khiển và có sưởi\n    - Âm thanh 6 loa\n    - Đèn sương mù";
	}
	
	public void displayToyotaIQ1(){
		display();
		System.out.println("  Phụ kiện riêng cho dòng xe này");
		System.out.println(phuKien);
	}
}
