


class Student
{

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

private int roll;
private String name;


}

class S3
{
public static void main(String args[])
{

Student s1=new Student();
s1.setRoll(3);
s1.setName("RadhaKrishna");

System.out.println(s1.getName());
System.out.println(s1.getRoll());

}
}




