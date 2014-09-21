class Fourteen
{
public static void main(String args[])
{


int sum=0;

one:
for(int a=1;a<=10;a++)
{

	two:
	for(int k=1;k<=10;k++)
	{
	if(k%2==0)
	continue one;
	sum=sum+(a+k);
	}

}


System.out.println(sum);



}
}