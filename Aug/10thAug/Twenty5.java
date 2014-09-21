


class A
{
int n;
}

class B
{
int n;
}

class Twenty5
{

public static void main(String args[])
{
A a1=new A();
a1.n=500;

B b1=new B();
b1.n=300;

a1=b1;

System.out.println(a1.n);
System.out.println(b1.n);
}

}




