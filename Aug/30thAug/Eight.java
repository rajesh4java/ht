

import java.util.*;


class A
{
}


class Eight
{

public static void main(String args[])
{
System.out.println("Vishnu");


ArrayList al=new ArrayList();
al.add(10);
al.add(20);
al.add(30);
al.add("Krishna");
al.add("Radha");
al.add(true);
al.add(95.27);
al.add('V');
al.add(new A());

for(Object obj:al)
System.out.println(obj);

}

}
