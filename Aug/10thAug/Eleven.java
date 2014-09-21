
class Student
{
int roll;
static String schoolName;
}


class Eleven
{

public static void main(String args[])
{

Student s1=new Student();
s1.roll=5;

s1.schoolName="MVN";

Student s2=new Student();
s2.roll=12;

s2.schoolName="VidyaMandir";

System.out.println("s1.roll is "+s1.roll);
System.out.println("s1.schoolName is "+s1.schoolName);

System.out.println("s2.roll is "+s2.roll);
System.out.println("s2.schoolName is "+s2.schoolName);
System.out.println("Student.schoolName is "+Student.schoolName);

}

}

