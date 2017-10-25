package pkg1;

public class Class1
{
   public Class1() 
   {
	System.out.println("default constructor");
   }
   
   public Class1(int r) 
   {
	   this();
	System.out.println("1 parameter constructor");
   }
   
   public Class1(int r,int b) 
   {
	   this(45);
	System.out.println("2 parameter constructor");
   }
   
   public static void main(String[] args) 
   {
	Class1 ref=new Class1(1,2);
	   
   }
	
}
