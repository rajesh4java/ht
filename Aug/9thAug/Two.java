
class A
{

int n; //instance variable
int m=8;//instance variable

static int k;//class variable


}


/*

instance variables are created when object is created and there exists a separate copy of instance variables for each of the object.Each object has different copy of instance variable.


class variables are created when the class is loaded and there exists a single copy of class variables for all the objects. ie. all the objects share the same single copy of static or class variable.



Both ie. instance variable as well as class variable are initialized with default values.
*/

class Two
{
public static void main(String args[])
{

int n;
n=5;


A a1=new A();

System.out.println(a1.n);
System.out.println(a1.m);
System.out.println(n);


}

}
