class A
{
private int n=10; //n is non-static variable or instance variable
private static int k;//k is static variable or class variable


//instance method or non-static method
void display()
{
System.out.println(n);
}

//instance method or non-static method
public int getN()
{
return n;
}

//instance method or non-static method
public void setN(int v)
{
n=v;
}

//class method or static method
public static int getK()
{
return k;
}

//class method or static method
public static void setK(int d)
{
k=d;
}

}

/*
the contents of a class is also known as features of the class. the features can be divided into two categories:
1 non-static 
2. static
*/


class Six
{

public static void main(String args[])
{

A  a1=new A();

int a=a1.getN();
System.out.println("k is now "+A.getK());
System.out.println("n is now "+a1.getN());

a1.setN(71);
a1.setK(12);

A.setK(2500);

System.out.println("k is now "+A.getK());
System.out.println("n is now "+a1.getN());


}

}

