
class A
{

void display(B temp) 
{
System.out.println("Radhey");
}

void display(C temp) 
{
System.out.println("Kishan ");
}

}

class B
{
}

class C
{
}


class One
{
public static void main(String []args)
{

B b1=new B();
C c1=new C();

A a1=new A();

a1.display(null);



}

}
