package MaiAnh.HomeWork.Lession7.Bai2;

public class Vina extends ChuanISO{
	@Override
	void registerBandwith() {
		System.out.println("Băng thông tần số: WCDMA");
	}

	@Override
	void registerFrequency() {
		System.out.println("Tần số sử dụng: 900-902 MHz");
	}
}
