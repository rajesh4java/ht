


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


class Fourteen
{
public static void main(String[]args)
{


Student s1=new Student(10,"Vishnu");

Student s2=new Student(20,"Ambey");

Student s3=new Student(30,"Gauri");

Student s4=new Student();
s4.setRoll(5);
s4.setName("Panchmukhi Hanuman");

Student obj[]={ s3,s1,s2,s4};


for(Student temp:obj)
System.out.println(temp.getRoll()+"\t"+temp.getName());


}

}
