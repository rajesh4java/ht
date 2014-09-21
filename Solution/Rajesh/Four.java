
class Four
{
public static void main(String args[])
{

int c=10;

int v=9;

int d=v;

for(int k=1;k<=9;k++)
{

//for space

for(int m=1;m<=c;m++)
System.out.print(" ");


for(int m=1;m<=d;m++)
System.out.print("*");


if(k<5)
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
