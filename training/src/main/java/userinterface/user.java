package userinterface;
import java.util.*;

import mathsoperation.Operation;

public class user {
	public static void main(String args[])
	{
	int a,b,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a and b values");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("select the operation 1.add 2.sub 3.multi 4.division");
		n=s.nextInt();
		switch(n)
		{
		case 1: System.out.println(Operation.getAppdata().add(a,b));break;
		case 2: System.out.println(Operation.getAppdata().sub(a,b));break;
		case 3: System.out.println(Operation.getAppdata().multi(a,b));break;
		case 4: System.out.println(Operation.getAppdata().divide(a,b));break;
		default:
			System.out.println("wrong choice");
		}
		
		
	}

}
