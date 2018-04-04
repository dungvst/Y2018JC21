package MaiAnh.HomeWork.Lession8;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("Enter the number of elements of the array:");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n = scan.nextInt();
		System.out.println("Enter the numner of columns:" );
		int m = scan.nextInt();
		int [][]intArray = new int[n][m];
		inputArray(intArray, n, m);
		System.out.println("Integer Array:");
		Main1.ouputArray(intArray);
		sumOfColumn(intArray, n, m);
		
		
	}
	
	static void inputArray(int [][]intArray, int noOfRows, int noOfColumns){
		Scanner scan = new Scanner(System.in);
		for(int i=0; i< noOfRows ; i++){
			for(int j=0; j<noOfColumns; j++){
				System.out.printf("Enter the value of element in row %d column %d\n",(i+1),(j+1));
				intArray[i][j] = scan.nextInt();
			}
		}
	}
	
	static void ouputArray(int [][] intArray){
		for (int[] is : intArray) {
			for (int i : is) {
				System.out.printf("  %d",i);
			}
			System.out.println();
		}
	}
	
	public static void sumOfColumn(int [][]intArray, int noOfRows, int noOfColumns){
		for(int i=0; i<noOfColumns; i++){
			int sum =0;
			for(int j=0; j<noOfRows; j++){
				sum = sum +intArray[j][i];
			}
			System.out.println("The sum of elements in column " + (i+1) + " is : "+ sum);
		}
	}

}
