class Twenty6
{
public static void main(String args[])
{


int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);

if(a>b)
{
 
 if(a>c)
System.out.println(a+ " is the biggest" );
else
System.out.println(c+ " is the biggest" );

}
else
{
 if(b>c)
System.out.println(b+ " is the biggest" );
else
System.out.println(c+ " is the biggest" );
}


}
}
