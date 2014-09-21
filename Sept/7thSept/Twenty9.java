

class A
{

void display(int...n)
{
System.out.println("This is display");

for(int a:n)
System.out.println(a);

}


}



class Twenty9 
{
public static void main(String []args)
{
System.out.println("Vishnu");


int arr[]={80,40,20,10};

A a1=new A();
a1.display(arr);

}

}
