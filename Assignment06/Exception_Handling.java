import java.util.Scanner;
public class Exception_Handling
{
    public static void main(String[] args)
    {
        int i,num1,num2;
        int array[]={17,21,28,3,72};
        int ch=1;
        int choice;
        try
        {
            Scanner sc = new Scanner(System.in);
            do 
            {
                
                System.out.println("====================================");
                System.out.println("Enter Your Choice:: ");
                System.out.println("1.Divisin Of two numbers ");                
                System.out.println("2.Array ");
                System.out.println("====================================");
                choice= sc.nextInt();
                switch (choice) 
                {
                    case 1:
                        System.out.println("Enter integer numerator: ");
                        num1=sc.nextInt();
                        System.out.println("Enter integer denominator: ");
                        num2=sc.nextInt();
                        System.out.println("Division of two integers : "+(num1/num2));
                        break;
                    case 2:
                        System.out.println("Enter array index you want to access: ");
                        i=sc.nextInt();
                        System.out.println("Array element array["+i+"] is: "+array[i]);
                        break;
                
                    default: System.out.println("Invalid!!!");
                        
                }
                System.out.println("Do you want to continue(1/0)");
                ch=sc.nextInt();
                
            } while (ch==1);
            
            

        }

        catch (ArithmeticException e)
        {
            //catch divide by zero error using Arithmetic Exception Class
            System.out.println("\n\tArithmatic Exception Caught! \n\tDivide by zero error. \n\t!!Check your denominator!!");
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            //catch invalid index using Array Index out of bound Exception class
            System.out.println("\n\tArray Index Out Of Bounds Exception Caught!\n\t!!!Check your array index you are trying yo access!!!");
        }

        catch (Exception e)
        {
            //catch Number format exception using Exception class
            System.out.println("\n\tNumber format Exception Caught!\n\t!!!Use integers as numerator and denominator!!!");
        }

        System.out.println("\n---------------End of Exception Handling-------------");
    }
}


