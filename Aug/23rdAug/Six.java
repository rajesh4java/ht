

//zig-zag array
//ragged array
//jagged array

class Six
{
public static void main(String[]args)
{



int[][]num=new int[4][];

num[0]=new int[5];
num[1]=new int[3];
num[2]=new int[7];
num[3]=new int[2];


int c=0;

for(int k=0;k<num.length;k++)

for(int m=0;m<num[k].length;m++)
  num[k][m]=++c;


for(int k=0;k<num.length;k++)
{
for(int m=0;m<num[k].length;m++)
System.out.print(num[k][m]+ " ");

System.out.println();
}


}

}
