package Lession6;

public class Main {

	public static void main(String[] args) {
		NongDan nd1 = new NongDan(2, 2, 10, 4, "Cuoc", "Thuong Phuc", "Vang", "Com");
		System.out.println("Dac tinh nong dan 1:");
		nd1.HienThi();
		nd1.diChuyen();
		nd1.laoDong();
		System.out.println();
		
		ChienBinh cb1 = new ChienBinh(2, 2, 100, 50, "Kiem", "Ao giap sat", "Den", "Luong Kho");
		System.out.println("Dac tinh chien binh 1:");
		cb1.HienThi();
		cb1.diChuyen();
		cb1.tanCong();
	}

}
