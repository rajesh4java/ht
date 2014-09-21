class A
{
private int n;
public int getN()
{
return n;
}
public void setN(int n)
{
n=n;
}
}
class S4
{
public static void main(String args[])
{
System.out.println("Vishnu");
A a1=new A();
System.out.println(a1.getN());
int k=a1.getN();
System.out.println(a1.getN());
}
}
