


class A
{
int n=10;

void one()
{
int n=30;
System.out.println(n);
}

void two()
{
System.out.println(n);
}


}

class S4
{
public static void main(String args[])
{

A obj=new A();
obj.one();
obj.two();


}
}




