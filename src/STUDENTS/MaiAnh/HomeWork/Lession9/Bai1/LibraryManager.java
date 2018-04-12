package STUDENTS.MaiAnh.HomeWork.Lession9.Bai1;

import java.awt.*;
import java.util.ArrayList;
public class LibraryManager {
    private ArrayList materialList;



    public LibraryManager(){
        this.materialList = new ArrayList();
    }
    public void display(){
        for (Object m: materialList) {
            System.out.println(m);
        }
    }

    public ArrayList getMaterialList() {
        return materialList;
    }
}
