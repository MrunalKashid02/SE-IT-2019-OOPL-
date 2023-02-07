// Problem Statement-
//              Design a base class shape with two double type values and member functions to input the data and compute_area() for calculating area of shape. Derive two classes: triangle and rectangle. Make compute_area() as abstract function and redefine this function in the derived class to suit their requirements. Write a program that accepts dimensions of triangle/rectangle and display calculated area. Implement dynamic binding for given case study.
import java.util.*;
abstract class shape
{

    abstract void Compute_Area();             //Creating Abstract Function
    
}
class Rectangle extends shape
{
    public void Compute_Area()
    {
        double length;
        double breadth;
        double Area;
        System.out.println("Enter the length of Rectangle::");
        Scanner sc= new Scanner(System.in);
        length = sc.nextInt();
        System.out.println("Enter the breadth of Rectangle::");
        breadth= sc.nextInt();
        Area=length*breadth;
        System.out.println("\n\tArea of Rectangle::"+Area);
        

    }
}
class Triangle extends shape
{
    public void Compute_Area()
    {
        double  base,height;
        double Area;
        System.out.println("Enter the base of triangle::");
        Scanner sc =new Scanner(System.in);
        base= sc.nextInt();
        System.out.println("Enter the height of triangle");
        height= sc.nextInt();
        Area=0.5*base*height;
        System.out.println("\n\tArea of Triangle::"+Area);

    }
}
public class Dynamic_Inheritance
{
public static void main(String[] args) 
{
    Scanner sc= new Scanner(System.in);
    Rectangle R1= new Rectangle();
    Triangle T1= new Triangle();
    
    int Num1;
    while (true) 
    {
        System.out.println("-------------------------------------------------------");
        System.out.println("Enter Your Choice:: \n\t1.Calculate Area of Rectangle \n\t2.Calculate Area of Triangle");
        System.out.println("-------------------------------------------------------");
        Num1= sc.nextInt();
        System.out.println("-------------------------------------------------------");
        if (Num1==1)
        {
            R1.Compute_Area();
        }
        else if (Num1==2) 
        {
            T1.Compute_Area();
        }
        else
        {
            System.out.println("Choose appropriate option");
            break;
        }
    }
}

}
