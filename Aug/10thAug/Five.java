class A
{
private int n=10;
private static int k;

void display()
{
System.out.println(n);
}

}


class Five
{

public static void main(String args[])
{

A  a1=new A();

System.out.println(a1.n);
System.out.println(a1.k);
System.out.println(A.k);

}

}

