
class Five
{
public static void main(String args[])
{

int c=10;



int d=5;

for(int k=1;k<=5;k++)
{

//for space

for(int m=1;m<=c;m++)
System.out.print(" ");


for(int m=1;m<=d;m++)
System.out.print("*");


if(k<3)
{
c++;
d=d-2;
}
else
{
c--;
d=d+2;
}

System.out.println();

}


}

}
