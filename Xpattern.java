//program to print the given 'x'pattern
class Xpattern
{
public static void main(String args[])
{ 
 System.out.println("enter the number of rows the pattern need to be printed  ");
 int n=Integer.parseInt(System.console().readLine());
if(n<=2)
{
System.out.println("we dont get the exact 'x' pattern");
}
else
{
   int k=n;
   for(int i=1;i<=n;i++)   // for loop for  number of rows
   {
     for(int j=1;j<=n;j++)         //loop for column and for printing *
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
}    