





class Department
{
int id;
String name;

int getId()
{
return id;
}

String getName()
{
return name;
}

}


class Employee
{
int id; 
String name;

Department dept;

void display()
{
System.out.println("Vishnu");

System.out.println("Employee id is "+id);
System.out.println("Employee name is "+name);
System.out.println("Department id is "+dept.getId());
System.out.println("Department name is "+dept.getName());
}

}

class Sixteen
{
public static void main(String args[])
{

Department d1=new Department();
d1.id=100;
d1.name="finance";


Employee e1=new Employee();
e1.id=57;
e1.name="RadhaKrishna";
e1.dept=d1;


System.out.println(e1.id);
System.out.println(e1.name);
System.out.println(e1.dept.id);
System.out.println(e1.dept.name);


System.out.println("Through display....");
e1.display();


}
}
