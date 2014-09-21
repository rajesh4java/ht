
class B
{
int n;
}

class A
{

void one(B obj1,B obj2)
{

B temp=obj1;
obj1=obj2;
obj2=temp;

}

}

class CBV
{
public static void main(String args[])
{
System.out.println("Jai Kaalka Maa!!!");

B temp1=new B();
temp1.n=40;

B temp2=new B();
temp2.n=80;


System.out.println("temp1.n="+temp1.n+"\t temp2.n="+temp2.n);

A a1=new A();
a1.one(temp1,temp2);

System.out.println("temp1.n="+temp1.n+"\t temp2.n="+temp2.n);


}

}
