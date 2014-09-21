

import java.util.*;


class Thirteen
{

public static void main(String args[])
{
System.out.println("Vishnu");


ArrayList<String> al=new ArrayList<String>();

al.add("Radha");
al.add("MahaKaali");
al.add("Krishna");
al.add("Gauri");
al.add("Durgey");
al.add("Bhavani");
al.add("Ambey");

Collections.sort(al);


for(String obj:al)
System.out.println(obj);

}

}
