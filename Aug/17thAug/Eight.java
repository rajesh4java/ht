class A
{

void say()
{
System.out.println("Shree Krishna");
}

}

class Eight
{
public static void main(String args[])
{

A a1=new A();

a1.say();

System.out.println(a1.hashCode());
System.out.println(a1.toString());
System.out.println(a1.getClass());


}

}
