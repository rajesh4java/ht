
class A
{
private int n=10;

void display()
{
double n=25.3;
System.out.println(n);
System.out.println(this.n);
System.out.println(n);
}

}

class S13
{
public static void main(String args[])
{
System.out.println("Vishnu");
A a1=new A();
a1.display();
}
}
