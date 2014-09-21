import java.util.*;


class Twenty7
{
public static void main(String[]args)
{
Scanner abc=new Scanner(System.in);

System.out.println("Enter the size ");
int size=abc.nextInt();

int num[]=new int[size];

int sum=0;

for(int k=0;k<num.length;k++)
{
System.out.println("Enter the value "+(k+1)+"=");
num[k]=abc.nextInt();
sum=sum+num[k];
}


System.out.println("sum is "+sum);



}

}
