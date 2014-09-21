class A
{
int n=10;
static int k;

void display()
{
System.out.println(n);
}

}


class Four
{

public static void main(String args[])
{

A  a1=new A();
System.out.println(a1.n);
System.out.println(a1.k);
System.out.println(A.k);

System.out.println(A.n);

}

}

