package STUDENTS.MaiAnh.HomeWork.Lession9.Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Book b1 = new Book("THE FAULT IN OUR STARS", true, "", "JOHN GREEN");
        Book b2 = new Book("ANNA FRANK", false, "9/4/2018", "ANNA FRANK");
        Book b3 = new Book("NHUNG NGAY TUOI DEP", false, "11/3/2018", "JENIFER NIVEN");
        Video v1 = new Video("COLECTION IN JAVA", false , "10/4/2018", 20);
        Video v2 = new Video("GENERIC",true,"1/1/1",30 );
        Newspaper n1 = new Newspaper("PROGRAMING TREND IN 2018", true, "", "DZ");

        System.out.println("Chon kieu quan li thu vien\n1.Normal\n2.With Generic");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n==1) {
            LibraryManager l1 = new LibraryManager();
            l1.getMaterialList().add(b1);
            l1.getMaterialList().add(b2);
            l1.getMaterialList().add(b3);
            l1.getMaterialList().add(v1);
            l1.getMaterialList().add(n1);
            l1.getMaterialList().add(b2);


            System.out.println("The material list:");
            int i=1;
            for (Object b : l1.getMaterialList()) {
                System.out.println("i. " + b);
                i++;
            }
        }else if(n==2){

            LibraryManagerWithGeneric l2 = new LibraryManagerWithGeneric();
            l2.addBook(b1);
            l2.addBook(b2);
            l2.addBook(b3);
            l2.addVideo(v1);
            l2.addVideo(v2);
            l2.addNewspaper(n1);

            System.out.println("The list of materials:");
            l2.display();

            System.out.println("find book by name\nEnter book's name: ");
            scan.nextLine();
            String searchName = scan.nextLine();
            System.out.println("Result: " + l2.searchBook(searchName));

            System.out.println("find video by name\nEnter video's name: ");
            String searchVideo = scan.nextLine();
            System.out.println("Result: " + l2.searchVideo(searchVideo));

            System.out.println("find newspaper by name\nEnter newspaper's name: ");
            String searchNewspaper = scan.nextLine();
            System.out.println("Result: " + l2.searchNewspaper(searchNewspaper));


        }

    }

}

