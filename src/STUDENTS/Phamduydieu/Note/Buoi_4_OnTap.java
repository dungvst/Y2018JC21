package Phamduydieu.Note;

import java.util.Scanner;

public class Buoi_4_OnTap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
Check điều kiện trước sau đó với vào lệnh
 while ( dieukien)
 {
 		Các lệnh
 }
=========================
Do luôn thực hiện lệnh 1 lần đầu tiên sau đó mới check điều kiện
Do
{
	Các lệnh
}
While ( dieukien)
============================
ví dụ:
Nhập số;
Kiểu check: Chẵn, lẻ
output: Số lượng thỏa mãn
 */
		int a = 100;
		int count = 0;
		while(a<=100) {
			if(a%2==0) {
				System.out.println("Số Chẵn");				
			}
			else 
				System.out.println("Số Lẻ");
		}
	}

}
