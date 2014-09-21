
class A
{

void display(char ch,int...a)
{
System.out.println("Radhey ");

System.out.println(ch);

for(int k:a)
System.out.println(k);

}

}


class Twenty4
{
public static void main(String []args)
{
System.out.println("Vishnu");

A a1=new A();
//a1.display();

a1.display('H');

a1.display('V',20,40);

}

}
