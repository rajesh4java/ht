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


class Three
{
public static void main(String[]args)
{


Student s1=new Student();

System.out.println(s1.getRoll()+"\t"+s1.getName());



}

}
