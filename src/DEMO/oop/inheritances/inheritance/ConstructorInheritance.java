package DEMO.oop.inheritances.inheritance;

class Base {
    int x;
    Base() {
        x = 11;
    }
    Base(int x) {
        this.x = x;
    }
}

class Derived extends Base {
    int y;
    Derived(int _x, int _y) {
        super(_x);
        y = _y;
    }
    void Display() {
        System.out.println("x = "+x+", y = "+y);
    }
}

public class ConstructorInheritance {
    public static void main(String[] args) {
        Base base = new Base(22);
        Derived d = new Derived(10, 20);
        d.Display();
    }
}
