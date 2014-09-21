


class Student
{
private int roll;
private String name;

public int getRoll()
{
return roll;
}

public String getName()
{
return name;
}

public void setRoll(int k)
{
roll=k;
}

public void setName(String n)
{
name=n;
}

}

class S2
{
public static void main(String args[])
{

Student s1=new Student();
s1.setRoll(5);
s1.setName("Radha");

System.out.println(s1.getName());
System.out.println(s1.getRoll());

}
}




