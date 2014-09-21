
class A
{

void one(Object obj)
{
System.out.println("Object");
}

}


class Six
{
public static void main(String []args)
{
System.out.println("Vishnu");

A a1=new A();

a1.one("Krishna");

Object temp="Durgey"; //upcasting

Object obj=new Object();

System.out.println(temp);
System.out.println(obj);

}

}
