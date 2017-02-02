//program to print the given 'x'pattern
class Xpattern
{
public static void main(String args[])
{ 
 System.out.println("enter the number of rows the pattern need to be printed");
 int n=Integer.parseInt(System.console().readLine());
   int k=n;
   for(int i=1;i<=n;i++)
   {
     for(int j=1;j<=n;j++)
       {  
         
	     if(i==j)
            System.out.print("*");
          if(i==((n/2)+1)&&(j==(n/2)+1))
            break;			  
	     if(j==k)
	     
           System.out.print("*");
	     
		
		else
             System.out.print(" ");
	   }	 
	   k--;
       System.out.println();
   }
}
}    