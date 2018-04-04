package MaiAnh.HomeWork.Lession8;

public class Main3 {

	public static void main(String[] args) {
		int []iArray = {1,2,3,4,5,6};
		double []dArray = {6.0, 4.4, 1.9 ,2.9, 3.4, 3.5};
		System.out.println("The average of the elements of iArray: " + averageArray(iArray));
		System.out.println("The average of the elements of dArray: " + averageArray(dArray));
		
	}
	
	public static int averageArray(int []array){
		int sum=0;
		for (int i : array) {
			sum = sum +i;
		}
		return sum/(array.length + 1);
	}
	
	public static double averageArray(double []array){
		double sum =0.0;
		for (double d : array) {
			sum = sum + d;
		}
		return sum/(array.length + 1);
	}

}
