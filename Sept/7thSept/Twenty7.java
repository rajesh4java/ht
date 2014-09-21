

class A
{

void display(int v,int...n)
{
System.out.println("This is display");

//System.out.println(v);

System.out.println(n.length);

for(int a:n)
System.out.println(a);

}


}



class Twenty7
{
public static void main(String []args)
{
System.out.println("Vishnu");


A a1=new A();
//a1.display(200,30,80,70,64);

a1.display(200,30,80,70,64,10,20,120);

}

}
