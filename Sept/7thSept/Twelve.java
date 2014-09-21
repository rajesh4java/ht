
class A
{

void display(Object obj)
{
System.out.println("WaheGuru "+obj);
}

void display(Integer obj)
{
System.out.println("Khalsa "+obj);
}


}


class Twelve
{
public static void main(String []args)
{
System.out.println("Vishnu");


A a1=new A();

a1.display(5);


Integer i=25;//autoboxing

Object temp=28;
System.out.println(temp);

Integer k=new Integer(17);




}

}
