import  java.util.*;
public class Mergesort
{
	public static void main(String args[])
	{
		int i,n,size;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n:");
		n = sc.nextInt();
		int a[]=new	int	[20];
		System.out.println("enter"+n+"number 1 by 1" );
		for(i=0;i<n;i++)
		{
int number =sc.nextInt();
a[i]=number ;
		}
	size=n-1;
Mergesort(a,0,size);
System.out.println("sorted array:");
for(i=0;i<n;i++)
System.out.println(""+a[i]);
	}
public static void Mergesort(int []array,int low,int high)
{
if(low<high)
{
int middle =(low+high)/2;
	Mergesort(array,low,middle);
	Mergesort(array,middle+1,high);
	Mergesort(array,low,middle,high);
}
}
public static void Mergesort(int []a,int low ,int middle,int high)
{
	int []b=new int [a.length];
	for (int i =low ;i<= high ; i++)
	{
		b[i]=a[i];
	}
	int h = low ;
	int j =middle+1;
	int i = low ;
	while (h<middle && j<=high )
	{
		if (b[h]<=b[j])
		{
			a[i]=b[h];
			h++;
		}
		else 
		{
			a[i]=b[j];
			j++;
		}
		i++;
	}
	int remaining =middle-h;
	for (int k =0;k<= remaining;k++)
	{
		a[i+k]=b[h+k];
	}
}
}

	
