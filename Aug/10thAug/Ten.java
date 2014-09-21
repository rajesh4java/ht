class A
{

int n=80;

static int v=20;

void one()
{
System.out.println(n);
two();
System.out.println(v);
}

static void two()
{
System.out.println("Krishna");
}

}


/*
static features can be accessed inside non-static method
*/


class Ten
{

public static void main(String args[])
{

A obj=new A();
obj.one();

}

}

