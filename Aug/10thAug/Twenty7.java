


class A
{
int n;
}

class Twenty7
{
public static void main(String args[])
{
A a1=new A();
a1.n=4000;

A b1=new A();
b1.n=7000;

b1=a1;

a1.n=8000;

System.out.println(a1.n);
System.out.println(b1.n);

}
}




