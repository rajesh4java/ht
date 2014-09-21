import java.util.*;



class Student 
{
private int roll;
private String name;

Student(int roll,String name)
{
this.roll=roll;
this.name=name;
}

public int getRoll()
{
return roll;
}

public String getName()
{
return name;
}


public void setRoll(int roll)
{
this.roll=roll;
}

public void setName(String name)
{
this.name=name;
}


public Student()
{
}


}


class Two
{
public static void main(String[]args)
{


Student obj[]=new Student[5];

for(Student temp:obj)
System.out.println(temp.getRoll()+"\t"+temp.getName());


}

}
