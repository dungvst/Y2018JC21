package MaiAnh.HomeWork.Lession3;

import java.util.Scanner;

public class FavortieNumber {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int favoritNumbers[]={1,3,7,9,15,20};
		System.out.println("Type a integer number: ");
		int x = sn.nextInt();
		if(isFavoriteNumber(x, favoritNumbers)){
			System.out.println("The value of the number is: " + x);
		}else{
			System.out.println("I don't like this number");
		}
		
	}
	
	public static boolean isFavoriteNumber(int x, int favoritNumbers[]){
		for(int i=0; i<6;i++){
			if(favoritNumbers[i]==x){
				return true;
			}
		}
		return false;
	}

}
