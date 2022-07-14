package Loops;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=2;
while(i<=20)
{
	System.out.println(i);
	i=i+2;
}
//reverse table of 6
int p=60;
while(p>=6)
{
	System.out.println(p);
	p=p-6;
	
}
String name="nilesh";
int j=1;
while(j<=5)
{
	System.out.println(name);
	j++;
}
int x,y,z;
for(x=1;x<=10;x++) {
	for(y=1;y<=10;y++)
	{
		z=x*y;
		System.out.println(""+(z));
	}
	System.out.println();
}
int n=10;
int m=10;
for(int a=2;a<=m;a++) {
	for(int k=1;k<=n;k++)
	{
		System.out.println(""+k*a);
	}
	System.out.println("");
}

	}
}



