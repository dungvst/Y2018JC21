package STUDENTS.MaiAnh.HomeWork.Lession9.Bai1;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;

public class LibraryManagerWithGeneric {
    private ArrayList<Book> bookList;
    private ArrayList<Video> videoList;
    private ArrayList<Newspaper> newspapersList;
    private ArrayList materialList;


    public  LibraryManagerWithGeneric(){
        this.newspapersList = new ArrayList<Newspaper>();
        this.bookList = new ArrayList<Book>();
        this.videoList = new ArrayList<Video>();
        this.materialList = new ArrayList();

    }

    //Them 1 doi tuong quan li
    public void addBook(Book b){
        bookList.add(b);
        materialList.add(b);
    }
    public void addVideo(Video v){
        videoList.add(v);
        materialList.add(v);
    }
    public void addNewspaper(Newspaper n){
        newspapersList.add(n);
        materialList.add(n);
    }

    //method: xu ly tim kiem
    public Book searchBook(String searchName){
        Book result = new Book();
        for (Book b: bookList) {
            if(b.getName().equals(searchName))
                result=b;
        }
        return result;
    }

    public Video searchVideo(String searchName){
        Video result = new Video();
        for (Video b: videoList) {
            if (b.getName().equals(searchName))
                result = b;
        }
        return result;
    }

    public Newspaper searchNewspaper(String searchName){
        Newspaper result = new Newspaper();
        for (Newspaper b: newspapersList) {
            if (b.getName().equals(searchName))
                result = b;
        }
        return result;
    }

    public void display(){
        int i=1;
        for (Object m: materialList) {
            System.out.println("i. " + m);
        }
    }
}
