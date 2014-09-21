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


class Twelve
{
public static void main(String[]args)
{

Scanner in=new Scanner(System.in);

System.out.println("enter the size ");
int size=in.nextInt();

Student obj[]=new Student[size];


for(int k=0;k<obj.length;k++)
{
System.out.println("enter the roll=");
int roll=in.nextInt();

in.nextLine();

System.out.println("enter the name=");
String name=in.nextLine();

obj[k]=new Student();
obj[k].setRoll(roll);
obj[k].setName(name);

}

System.out.println("Following are the accepted values...." );

for(Student temp:obj)
System.out.println(temp.getRoll()+"\t"+temp.getName());


}

}
