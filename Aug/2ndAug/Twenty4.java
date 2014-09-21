class Twenty4
{
public static void main(String args[])
{


int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);

if((a>=b) && (a>=c))
System.out.println(a+ " is the biggest" );

if((b>=a) && (b>=c))
System.out.println(b+ " is the biggest" );

if((c>=a) && (c>=b))
System.out.println(c+ " is the biggest" );



}
}