package MaiAnh.HomeWork.Lession4;

import java.util.Arrays;
import java.util.Scanner;

public class MangSoNguyen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of the elements:");
		int n = scan.nextInt();
		while(n<1){
			System.out.println("The number of the elements must be greater 0, enter again:");
			n = scan.nextInt();
		}
		int arrays[] = new int[n];
		inputArrays(arrays, n);
		System.out.println("Sort in ascending order:");
		Arrays.sort(arrays);
		outputArrays(arrays);
		System.out.println("The smallest element: " + arrays[0]);
		System.out.println("The everage of the elements that are divisible by 3: "+ everage(arrays));
	}

// input
	public static void inputArrays(int arrays[], int n){
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<n; i++){
			System.out.println("Type element "+ (i+1) + ":");
			arrays[i]=scan.nextInt();
		}
	}
	
// output
	public static void outputArrays(int arrays[]){
		for(int i=0; i<arrays.length; i++){
			System.out.println(arrays[i]);
		}
	}
	
// caculate the everage of elements that are divisible by 3
	public static double everage(int arrays[]){
		int sum = 0;
		int count = 0;
		for(int i=0; i<arrays.length; i++){
			if(arrays[i]%3==0){
				sum = sum + arrays[i];
				count++;
			}
		}
		double everage=(double)sum/count;
		return everage;
	}
}
