class Fifteen
{
public static void main(String args[])
{


int sum=0;

for(int a=1;a<=10;a++)
{


	for(int k=1;k<=10;k++)
	{
	if(k%2==0)
	continue;
	sum=sum+(a+k);
	}

}


System.out.println(sum);



}
}