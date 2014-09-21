
class B
{
int n;
}

class A
{
void one(B obj)
{
System.out.println(obj.n);
}
}

class Nine
{
public static void main(String args[])
{
System.out.println("Jai Kaalka Maa!!!");

B temp=new B();
temp.n=400;

A a1=new A();
a1.one(temp);


}

}
