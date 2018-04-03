package MaiAnh.HomeWork.Lession3;

import java.util.Scanner;

public class Marry {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Type your FULL NAME: ");
		String fullName = sn.nextLine();
	//Xet ten
		if(!isName(fullName)){
			System.out.println("You did not type your NAME");
		}else{
	//Xet tuoi
			System.out.println("Type your AGE: ");
			int age = sn.nextInt();
			if(age<19){
				System.out.println("You are not enough old to get married");
			}else{
	//Xet gioi tinh
				System.out.println("Type your GENDER:\n1.Female\n2.Male");
				int gender  = sn.nextInt();
				if(!isGender(gender)){
					System.out.println("You did not enter your GENDER");
				}else{
	//Xet tinh trang hon nhan
					System.out.println("Type your MARITAL STATUS:\n1.Single\n2.Divorced\n3.Got to married ");
					int maritalStatus = sn.nextInt();
					if(!isMaritalStatus(maritalStatus)){
						System.out.println("you did not enter your MARITAL STATUS");
					}else{
	//Neu da nhap dung cac truong bat buoc thi xet kha nang dc tham gia ket hon
						if(gender==1){
							if(maritalStatus<3){
								System.out.println(fullName + ", You are eligible to marry");
							}else{
								System.out.println("you are not eligible to get married");
							}
						}else{
							if(age<22){
								System.out.println("you are not enough old to get married");
							}else{
								if(maritalStatus<3){
									System.out.println(fullName+ ", You ere eligible to get married");
								}else{
									System.out.println("You are not eligible to get married");
								}
							}
						}
					}
				}
			}	
		}
	}
	
	//Kiem tra Ten
	public static boolean isName(String fullName){
		if(fullName.isEmpty()){
			return false;
		}
		return true;
	}
	
	//Kiem tra Gioi Tinh
	public static boolean isGender(int gender){
		if((gender>=1)&&(gender<=2)){
			return true;
		}
		return false;
	}

	//Kiem tra Tinh Trang Hon Nhan
	public static boolean isMaritalStatus(int maritalStatus){
		if(maritalStatus>=1 && maritalStatus<=3){
			return true;
		}
		return false;
	}
}
