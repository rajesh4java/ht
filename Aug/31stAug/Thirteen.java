import java.util.*;


class Account
{
int balance;
String name;
String accountType;

Account(int balance,String name,String accountType)
{
this.balance=balance;
this.name=name;
this.accountType=accountType;
}

}

class A
{

Account getAccount(int amount,String name,String accountType)
{

if(amount<1000)
return null;
else
{
Account a=new Account(amount,name,accountType);
return a;
}

}

}

class Thirteen
{
public static void main(String args[])
{
System.out.println("Jai Kaalka Maa!!!");

Scanner in=new Scanner(System.in);

A a1=new A();

System.out.println("enter the amount=");
int amount=in.nextInt();

in.nextLine();

System.out.println("enter the name=");
String name=in.nextLine();

System.out.println("enter the account Type=");
String accountType=in.next();



Account obj=a1.getAccount(amount,name,accountType);

if(obj!=null)
System.out.println(obj.name+"\t"+obj.balance+"\t"+obj.accountType);
else
System.out.println("Sorry account could not be created for "+amount+" Rs");

}

}
