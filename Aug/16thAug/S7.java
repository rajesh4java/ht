class A
{
private int n;

public int getN()
{
return n;
}
public void setN(int n)
{
this.n=n;
}

}
class S7
{
public static void main(String args[])
{
System.out.println("Vishnu");
A a1=new A();
System.out.println(a1.getN());

a1.setN(52);

int k=a1.getN();
System.out.println(a1.getN());
}
}
