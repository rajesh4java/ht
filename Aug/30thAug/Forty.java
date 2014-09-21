class A
{

void one()
{
System.out.println("Hello");
two();
}

void two()
{
System.out.println("Hi");
one();
}


}


class Forty
{
public static void main(String args[])
{
System.out.println("Vishnu");

A a1=new A();
a1.one();

}
}
