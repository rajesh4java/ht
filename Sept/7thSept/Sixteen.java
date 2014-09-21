
class A
{

void display(Object obj)
{
System.out.println("Radha "+obj);
}

}


class Sixteen
{
public static void main(String []args)
{
System.out.println("Vishnu");

A a1=new A();
a1.display(100);
a1.display(200.0);
a1.display(80L);
a1.display(32F);
a1.display(91.2d);
a1.display(true);
a1.display('V');



}

}
