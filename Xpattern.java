class Xpattern
{  
	public static void main(String args[])
	{
	  
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i==j||j==(4-i))
				        System.out.print("*");
			    else
				{   
			
			        if(((i==0)&&(j==3))||((i==4)&&(j==3)))
						System.out.print("_");
					if((j==3)||(j==4))
				         System.out.print("");
			         else
						 System.out.print("_");
				}
			}     		
           System.out.println();	     
		 }
		 
	}
}