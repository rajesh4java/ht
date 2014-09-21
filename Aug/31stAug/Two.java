
class A
{

int abc(int n)
{
if(n==0)
return 1;

else
return n*abc(n-1);
}

}


class One
{
public static void main(String args[])
{
System.out.println("Vishnu");

A a1=new A();
System.out.println(a1.abc(5));

}

}
