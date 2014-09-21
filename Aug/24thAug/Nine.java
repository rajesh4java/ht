



class Car
{
String name;
}


class Person
{
String name;
Car c;
}


class Nine
{
public static void main(String[]args)
{

Person p1=new Person();
p1.name="Alex";


Car c=new Car();
c.name="BMW";

p1.c=c;


System.out.println(p1.name);
System.out.println(p1.c.name);

System.out.println("Hi");

}

}
