

class Eighteen
{
public static void main(String[]args)
{

int num1[]=new int[3];

num1[0]=50;
num1[1]=28;
num1[2]=10;


int num2[]=new int[5];

num2[0]=5;
num2[1]=2;
num2[2]=1;
num2[3]=7;
num2[4]=9;


for(int k=0;k<num2.length;k++)
System.out.println(num2[k]);

num2=num1;

System.out.println("Gap..........");



for(int k=0;k<num2.length;k++)
System.out.println(num2[k]);


}

}
