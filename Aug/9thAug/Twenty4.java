


class Student
{
private int roll;

public int getRoll()
{
return roll;
}


public void setRoll(int r)
{
roll=r;
}

}


class Twenty4
{
public static void main(String args[])
{

Student obj=new Student();


System.out.println(obj.roll);


System.out.println(obj.getRoll());

obj.setRoll(23);

System.out.println(obj.getRoll());

}
}


