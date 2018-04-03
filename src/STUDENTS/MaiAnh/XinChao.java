package STUDENTS.MaiAnh;

import java.util.Scanner;

public class XinChao {

	public static void main(String[] args) {
		System.out.println("HELLO EVERYONE ");
		System.out.println("If you wanna see my message press '1'\nUnless press '2'");
		Scanner sn = new Scanner(System.in);
		int x = sn.nextInt();
		int n=0;
		while((x<1)||(x>2)){
			System.err.println(x + " is a wrong option\nIf you wanna see my message press '1' \nUnless press '2'");
			x = sn.nextInt();
			n++;
			if(n>5){
				System.err.println("you pressed wrong options too many times");
				break;
			}
		}
		sn.close();
		switch(x){
		case 1:
			System.out.println("FEEL THE PEACE SPREADING THROUGH YOUR MIND :)))))))) ");
			break;
		case 2:
			System.out.println("Thanks!");
			break;
		default:
			break;
			
		}
	}
}
