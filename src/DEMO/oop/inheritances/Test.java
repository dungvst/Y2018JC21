package DEMO.oop.inheritances;


 class Super
{
    public Super(int x)
    {
    }
}

class Sub extends Super
{
   public Sub()
   {

       super(5);
   }
}

public class Test {
//     new Sub(10);
    Super aSuper = new Super(12);
}