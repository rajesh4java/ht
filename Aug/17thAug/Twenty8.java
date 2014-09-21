import java.util.*;


class Twenty8
{
public static void main(String[]args)
{
Scanner abc=new Scanner(System.in);

System.out.println("Enter the size ");
int size=abc.nextInt();

int num[]=new int[size];

int max=0;


for(int k=0;k<num.length;k++)
{
System.out.println("Enter the value "+(k+1)+"=");
num[k]=abc.nextInt();

if(k==0)
max=num[0];
else if(num[k]>max)
max=num[k];

}

System.out.println("Biggest value is  "+max);

}

}
