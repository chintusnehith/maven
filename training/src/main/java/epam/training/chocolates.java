package epam.training;

import java.util.*;
class sweets
{
	static int c=0;
	static int weight[];
	void count()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the weight");
		int n=sc.nextInt();
		c++;
		weight[c]=n;
		if(c==5)
		{
			for(int i=0;i<c;i++)
			{
				for(int j=i+1;j<c;j++)
				{
					if(weight[i]>weight[j])
					{
						int temp=weight[i];
						weight[i]=weight[j];
						weight[j]=temp;
						
						}
				}
			}
			System.out.println("children according to their weight");
			for(int i=0;i<c;i++)
			{
				System.out.println((i+1)+" "+weight[i]);
			}
			
		}
	}
}
class chocolates extends sweets
{
	public static void main(String args[])
	{
		sweets s=new chocolates();
		sweets s1=new chocolates();
		sweets s2=new chocolates();
		sweets s3=new chocolates();
		sweets s4=new chocolates();
		s.count();
		s1.count();
		s2.count();
		s3.count();
		s4.count();
	}
}