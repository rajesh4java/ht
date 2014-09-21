
class B
{
int n;
}

class A
{

B one()
{
B temp=new B();
temp.n=700;
return temp;
}

}

class Twelve
{
public static void main(String args[])
{
System.out.println("Jai Kaalka Maa!!!");




A a1=new A();
B b1=a1.one();

System.out.println("b1.n="+b1.n);


}

}
