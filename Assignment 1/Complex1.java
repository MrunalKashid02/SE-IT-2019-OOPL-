import java.util.*;
 
public class Complex1
{		
	public static void main(String args[]) 
	{
		int ch=0;
		float num1,num2,answer;		
		Complex_Op cal = new Complex_Op() ;
		Scanner input =  new Scanner(System.in);
 
		System.out.print("Enter the first Number\n");
		System.out.print("Real Part:");
		num1 = input.nextInt();
		System.out.print("Imaginary Part:");
		num2 = input.nextInt();
		Complex_Op Object1  = new Complex_Op(num1,num2);
 
		System.out.print("Enter the Second Number\n");
		System.out.print("Real Part:");
		num1 = input.nextInt();
		System.out.print("Imaginary Part:");
		num2 = input.nextInt();
		Complex_Op Object2  = new Complex_Op(num1,num2);
		do
		{
			System.out.println(" 1.Add");
			System.out.println(" 2.Subtract");			
			System.out.println(" 3.Multiplication");			
			System.out.println(" 4.Division");
			System.out.println(" 5.Exit");
			System.out.print("Choose Your choice: ");
			ch = input.nextInt();
			switch(ch)
			{
				case 1:				
					cal.Add_Numbers(Object1,Object2);
					break;				
				case 2:
					cal.Subtract_Numbers(Object1,Object2);
					break;
				case 3:				
					cal.Multiply_Numbers(Object1,Object2);
					break;				
				case 4:				
					cal.Divide_Numbers(Object1,Object2);
					break;				
				case 5:				
					break;				
			}
		}while(ch!=5);			
	}
}
class Complex_Op 
{
	private float real,imag;	
	Complex_Op()
	{
		real=0;
		imag=0;
	}
	Complex_Op(float Comp1,float Comp2)
	{
		real=Comp1;
		imag=Comp2;
	}	
	void  Add_Numbers(Complex_Op C1,Complex_Op C2)
	{
		float real,imag;
		real = (C1.real + C2.real); 
		imag = (C1.imag + C2.imag);
		System.out.println("Addition is:("+real+") + ("+imag+")i" );		
	}
	void Subtract_Numbers(Complex_Op C1,Complex_Op C2)
	{
		float real,imag;
		real = (C1.real - C2.real); 
		imag = (C1.imag - C2.imag);
		System.out.println("Subtraction is:("+real+") + ("+imag+")i" );		
	}
	void Multiply_Numbers(Complex_Op C1,Complex_Op C2)
	{
		float real,imag;
		real = (C1.real*C2.real - C1.imag*C2.imag); 
		imag = (C1.real*C2.imag + C2.real*C1.imag);
		System.out.println("Multiplication is:("+real+") + ("+imag+")i" );	
	}
	void Divide_Numbers(Complex_Op C1,Complex_Op C2)
	{
		float real,imag,deno;
		deno = (C2.real*C2.real + C2.imag*C2.imag);
		real = (C1.real*C2.real + C1.imag*C2.imag)/deno; 
		imag = (C2.real*C1.imag - C1.real*C2.imag)/deno;
		System.out.println("Division is:("+real+") + ("+imag+")i" );	
	}
}

