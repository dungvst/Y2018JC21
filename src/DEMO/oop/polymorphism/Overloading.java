package DEMO.oop.polymorphism;

public class Overloading {
    int add(int a, int b){return  a + b;}

    /*Cac truong hop thanh cong*/
    // Change the number
    int add(int a, int b, int c){return  a + b + c;}

    // Change the datatype
    int add(int a, String b){return  a;}

    /*Cac truong hop loi*/

//    float add(int a, int b){return  a + b;}

}


