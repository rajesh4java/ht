class A
{

int sum(int []arr)
{

int total=0;

for(int k:arr)
total+=k;

return total;
}
 
}



class One
{
public static void main(String []args)
{

int []num={10,50,30,20,70};

A a1=new A();

System.out.println(a1.sum(num));


}

}
