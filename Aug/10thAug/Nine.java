class A
{

int n;

void one()
{
System.out.println(n);
}

static void two()
{
System.out.println(n);
one();
}

}


/*
non-static features can not accessed inside static method
*/


class Nine
{

public static void main(String args[])
{

A obj=new A();
obj.display();

}

}

