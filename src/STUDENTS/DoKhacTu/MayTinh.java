package STUDENTS.DoKhacTu;

public class MayTinh extends TinhToan {
	private float a;
	private float b;
	private String phepToan;

	public String getPhepToan() {
		return phepToan;
	}

	public void setPhepToan(String phepToan) {
		this.phepToan = phepToan;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	@Override
	public float cong() {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public float tru() {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public float nhan() {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public float chia() {
		if (b == 0) {
			if (a == 0) {
				System.out.println("Result of function is underfined");
			} else {
				System.out.println("Cannot divide by zero");
			}

			return 0;
		} else {
			return a / b;
		}

	}
	
	public void inC1() {

		System.out.print("Ket qua: ");
		if (phepToan.equals("cong")) {
			System.out.println(cong());
		}

		else if (phepToan.equals("tru")) {
			System.out.println(tru());
		} else if (phepToan.equals("nhan")) {
			System.out.println(nhan());

		} else if (phepToan.equals("chia")) {
			System.out.println(chia());

		} else {
			System.out.println("ban chua chon phep toan");

		}

	}

	@Override
	public void cong1() {
		System.out.print(a + b);

	}

	@Override
	public void tru1() {
		System.out.print(a - b);

	}

	@Override
	public void nhan1() {
		System.out.print(a * b);

	}

	@Override
	public void chia1() {
		{
			if (b == 0) {
				if (a == 0) {
					System.out.println("Result of function is underfined");
				} else {
					System.out.println("Cannot divide by zero");
				}

			} else {
				System.out.print(a / b);
			}

		}
	}

	public void inC2() {

		System.out.print("Ket qua: ");
		if (phepToan.equals("cong")) {
			cong1();
		}

		else if (phepToan.equals("tru")) {
			tru1();
		} else if (phepToan.equals("nhan")) {
			nhan1();
		} else if (phepToan.equals("chia")) {
			chia1();
		} else {
			System.out.println("ban chua chon phep toan");

		}

	}
}
