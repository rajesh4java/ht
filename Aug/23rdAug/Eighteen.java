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


class Eighteen
{
public static void main(String[]args)
{

/*
int a[]=new int[5];
Student s1=new Student();
*/


Student obj[]=new Student[5];

obj[0]=new Student(10,"Vishnu");
obj[1]=new Student(5,"MahaLaxmi");
obj[2]=new Student(8,"MahaKaali");
obj[3]=new Student(1,"MahaGauri");

obj[4]=new Student();
obj[4].setRoll(3);
obj[4].setName("Hanuman");


for(Student temp:obj)
System.out.println(temp.getRoll()+"\t"+temp.getName());

System.out.println("different......");

for(int k=0;k<obj.length;k++)
System.out.println(obj[k].getRoll()+"\t"+obj[k].getName());


}

}
