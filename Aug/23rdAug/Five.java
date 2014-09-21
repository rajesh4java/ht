


class Five
{
public static void main(String[] args)
{


double[] num[]=new double[4][3];

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
