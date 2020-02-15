package mathsoperation;


public class Operation {

	int result;
	private static Operation appdata=null;
		private Operation() {}
		public static Operation getAppdata()
		{
			if(appdata==null)
				appdata=new Operation();
			return appdata;
		}
		
	
	
	

		public int add(int a1,int  b1)
			{
				
				result=a1+b1;
				return result;
				
			}
		  public int sub(int a1,int b1)
			{
				
				result=a1-b1;
				return result;
				
			}
		 public int  multi (int a1,int b1)
			{
				result=a1*b1;
				return result;
				
			}
		 public int divide(int a1,int b1)
			{
				
				result=a1/b1;
				return result;					
			}
		

}