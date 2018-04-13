package DoKhacTu.BTVN_10_04_2018;

import java.util.Collection;
import java.util.LinkedList;

public class LibraryUseGeneric<T> {
	LinkedList<T> a = new LinkedList<>();

	public void themMoi(T b) {
		a.add(b);
	
	}

	public T layThuVienCuoiCung() {
		return a.getLast();
	}
	
	
}