package MaiAnh.HomeWork.Lession3;

import java.util.Scanner;

public class IntergerArray {

	public static void main(String[] args) {
		int array[] = new int[10];
		System.out.println("Type 10 elements of integer array:");
		inputArray(array);
		System.out.println("The second max of integer array is: " + secondMax(array));
	}
	
	//Phuong thuc nhap
	public static void inputArray(int Array[]){
		Scanner sn = new Scanner(System.in);
		for(int i=0; i<10; i++){
			System.out.println("Type element " +(i+1));
			Array[i] = sn.nextInt();
		}
	}
	
	//Phuong thuc tim phan tu lon thu 2
	public static int secondMax(int array[]){
		int max = array[0];
		int target = array[0];
		for(int i=0; i<10; i++){
			if(array[i]>max){
				max=array[i];
			}
		}
		for(int i=0; i<10; i++){
			if(array[i]<max && array[i]>target){
				target=array[i];
			}
		}
		return target;
	}
}
