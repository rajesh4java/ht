class A
{
private int n;

public int getN()
{
return n;
}
public void setN(int k)
{
n=k;
}

}
class S8
{
public static void main(String args[])
{
System.out.println("Vishnu");
A a1=new A();

a1.setN(25);
System.out.println(a1.getN());

}
}
