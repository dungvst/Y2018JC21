package MaiAnh.HomeWork.Lession7.Bai2;

public class Main {
	public static void main(String[] args) {
		Viettel v = new Viettel();
		System.out.println("Nhà mạng Viettel:");
		v.registerBandwith();
		v.registerFrequency();
		System.out.println();
		Mobi m = new Mobi();
		System.out.println("Nhà mạng Mobi:");
		m.registerBandwith();
		m.registerFrequency();
		System.out.println();
		Vina vi = new Vina();
		System.out.println("Nhà mạng Vina:");
		vi.registerBandwith();
		vi.registerFrequency();
	}
}
