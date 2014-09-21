
//Var args (variable number of arguements)

class A
{

void display(int...a)
{
System.out.println("Radha ");
System.out.println(a);

System.out.println(a[0]);
}

}


class Nineteen
{
public static void main(String []args)
{
System.out.println("Vishnu");

A a1=new A();
a1.display(15);

}

}
