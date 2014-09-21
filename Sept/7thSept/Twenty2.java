
class A
{

void display(int...a)
{
System.out.println("Radhey ");

for(int k:a)
System.out.println(k);

}

}


class Twenty2
{
public static void main(String []args)
{
System.out.println("Vishnu");

A a1=new A();
//a1.display(15);

//a1.display(20,50);

a1.display(10,20,50,80,30,40,100);

}

}
