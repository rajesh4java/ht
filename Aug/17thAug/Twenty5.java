import java.util.*;


class Twenty5
{
public static void main(String[]args)
{
Scanner abc=new Scanner(System.in);

System.out.println("Enter the size ");
int size=abc.nextInt();

int num[]=new int[size];


for(int k=0;k<num.length;k++)
{
System.out.println("Enter the value "+(k+1)+"=");
num[k]=abc.nextInt();
}


System.out.println("Displaying .......");

for(int k:num)
System.out.println(k);


}

}
