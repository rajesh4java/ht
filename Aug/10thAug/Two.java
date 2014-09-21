class A
{
int n=10;
static int k;

void display()
{
System.out.println(n);
}

}


class Two
{
A a2=new A();

static A a3=new A();

public static void main(String args[])
{
A  a1=new A();
System.out.println(a1.n);
}

}

