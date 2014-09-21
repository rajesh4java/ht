
class A
{
}

class S18
{
public static void main(String args[])
{
System.out.println("Vishnu");

A a1=new A();
System.out.println(a1);

/*
System.out.println(a1.hashCode());
System.out.println(Integer.toHexString(a1.hashCode()));

System.out.println(a1.getClass().getName()+"@"+Integer.toHexString(a1.hashCode()));
*/

System.out.println(a1.getClass());
System.out.println(a1.getClass().getName());

}

}

