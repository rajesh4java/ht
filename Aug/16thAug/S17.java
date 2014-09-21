
class Student
{

int roll;
String name;

public String toString()
{
return roll+"\t"+name;
}

}

class S17
{
public static void main(String args[])
{
System.out.println("Vishnu");

Student s1=new Student();
s1.roll=10;
s1.name="Salasar";

System.out.println(s1);

Student s2=new Student();
s2.roll=5;
s2.name="MehndiPur";

System.out.println(s2);

}
}
