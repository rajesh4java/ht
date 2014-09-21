

class Student
{
int roll; 

void display()
{
System.out.println("Vishnu");
}

int getRoll()
{
return roll;
}


}

class Eleven
{
public static void main(String args[])
{
Student s1=new Student();

s1.display();

System.out.println(s1.getRoll());

Student s2=null;

s2.display(); //NPE

System.out.println(s2.getRoll());



}
}
