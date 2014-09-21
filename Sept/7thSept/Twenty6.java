

class A
{

void display(int v,int...n)
{
System.out.println("This is display");

//System.out.println(v);

for(int a:n)
System.out.println(a);

}


}



class Twenty6
{
public static void main(String []args)
{
System.out.println("Vishnu");


A a1=new A();
a1.display(200,30,80,70,64);


}

}
