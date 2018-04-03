package STUDENTS.Phamduydieu;

import java.util.Scanner;

public class BTVN_TimPhanTuLonThu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// BTVN: Tim phan lon thu 2 trong 10 phan tu cua mang ma minh nhap vao
		float arr[] = new float[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("NHẬP GIÁ TRỊ CÁC PHẦN TỬ CỦA MẢNG");
// Nhập giá trị các phần tử a[i]		
		for(int i= 0; i<10;i++)
		{
			System.out.print("a["+ i + "]: ");
			arr[i]=sc.nextFloat();
		}
// Tìm phần tử lớn thứ 2
		float Top1 = arr[0];
		float Top2 = arr[0];
// Tìm phần tử Top 1
		for(int i=0;i<10;i++)
		{
			if(arr[i]>Top1)
			{
				Top1 = arr[i];
			}
		}
// Tìm phần tử Top2
		for(int i=0; i<10; i++)
		{
			if(Top1>arr[i]&&arr[i]>Top2)
			{
				Top2 = arr[i];
			}
		}
		System.out.println(" Phần tử lớn thứ 1 là: "+ Top1 + "\n Phần tử lớn thứ 2 là: "+ Top2);
	}

}
