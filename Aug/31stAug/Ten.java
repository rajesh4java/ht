
class B
{
int n;
}

class A
{

void one(B obj)
{
obj.n=200;
}

}

class Ten
{
public static void main(String args[])
{
System.out.println("Jai Kaalka Maa!!!");

B temp=new B();
temp.n=400;

System.out.println(temp.n);

A a1=new A();
a1.one(temp);

System.out.println(temp.n);

}

}
