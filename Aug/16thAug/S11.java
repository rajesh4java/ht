

class A
{

void display()
{
System.out.println("Inside display "+this);
}

}

class S11
{
public static void main(String args[])
{
System.out.println("Vishnu");

A a1=new A();
System.out.println("Inside main "+a1);
a1.display();

A a2=new A();
System.out.println("Inside main "+a2);
a2.display();


}
}
