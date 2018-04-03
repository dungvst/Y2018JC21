package DEMO.oop.abstraction;

interface Printable{
    void print();
}

interface Showable{
    void show();
}

class MutipleInheritance implements Printable,Showable{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String args[]){
        MutipleInheritance obj = new MutipleInheritance();
        obj.print();
        obj.show();
    }
}