class A
{

int[] getArray()
{

int a[]={10,20,40,50};

return a;
}
 
}



class Two
{
public static void main(String []args)
{



A a1=new A();

int []num=a1.getArray();

for(int k:num)
System.out.println(k);


}

}
