import java.util.Scanner;

interface vehicle
{
    void gear_change();
    void speed_up();
    void apply_breaks();
}
class bicycle implements vehicle
{
//    declaring the default speed for bicycle as 5km/hr and riding on gear 1
   int speed=5;
   int gear=1;
   Scanner sc=new Scanner(System.in);
//   overriding the function in interface
   public void gear_change()
   {
       System.out.println("apply gear");
       System.out.println("you are on :"+gear+" gear");
       gear++;
       System.out.println("gear after applying : "+gear);
   }
    //   overriding the function in interface
   public void speed_up()
    {
       System.out.println("your current speed is : "+speed);

       int selection;
       int speedchannge;
       int max_speed=180;
       System.out.println("Enter the value of speed to be incremented or decremented");
       speedchannge=sc.nextInt();
       System.out.println("whether you want to increase(1) or decrease(2) speed of bicycle");
       System.out.println("Enter selection");
       selection=sc.nextInt();
       switch (selection){
           case 1:
               speed+=speedchannge;
               System.out.println("your current speed of bicycle after increasing is : "+speed+"km/hr");
               break;
           case 2:
               speed-=speedchannge;
               System.out.println("your current speed of bicycle after decreasing is : "+speed+"km/hr");
               break;
           default:
               System.out.println("invalid");
               break;
       }
   }
    //   overriding the function in interface
   public void apply_breaks(){
       System.out.println("to apply break select 1 for rear break amd 2 for front break");
       int selection;
       selection=sc.nextInt();
       switch (selection){
           case 1:
               speed=speed-5;
               System.out.println("you are driving bicycle at the speed of :"+speed);
               break;
           case 2:
               speed=0;
               System.out.println("vehicle is stopped");
               break;
           default:
               System.out.println("invalid");
               break;

       }
   }
}
class car implements vehicle{
    //    declaring the default speed for car as 10 km/hr and riding on gear 1
    int speed=10;
    int gear=1;
    Scanner sc=new Scanner(System.in);
    //   overriding the function in interface
    public void gear_change(){

        System.out.println("apply gear");
        System.out.println("you are on :"+gear+" gear");
        gear++;
        System.out.println("gear after applying : "+gear);
    }
    //   overriding the function in interface
    public void speed_up(){
        System.out.println("your current speed is : "+speed);

        int selection;
        int speedchannge;
        int max_speed=180;
        System.out.println("Enter the value of speed to be incremented or decremented");
        speedchannge=sc.nextInt();
        System.out.println("whether you want to increase(1) or decrease(2) speed of car");
        System.out.println("Enter selection");
        selection=sc.nextInt();
        if (max_speed<180) 
        {
            switch(selection)
            {
                case 1:
                    speed+=speedchannge;
                    System.out.println("your current speed of car after increasing is : "+speed+"km/hr");
                    break;
                case 2:
                    speed-=speedchannge;
                    System.out.println("your current speed of car after decreasing is : "+speed+"km/hr");
                    break;
                default:
                    System.out.println("invalid");
                    break;
            }
        }
        else
        {
            System.out.println("\n\tYou are reached at max speed \n\tControl your speed");
        }
    }
    //   overriding the function in interface
    public void apply_breaks(){
        System.out.println("to apply break select 1 for rear break amd 2 for front break");
        int sel;
        sel=sc.nextInt();
        switch (sel){
            case 1:
                speed=speed-5;
                System.out.println("you are driving car at the speed of :"+speed);
                break;
            case 2:
                speed=0;
                System.out.println("vehicle is stopped");
                break;
            default:
                System.out.println("invalid");
                break;

        }
    }
}
class bike implements vehicle{
    //    declaring the default speed for bike as 15km/hr and riding on gear 1
    int speed=15;
    int gear=1;
    Scanner sc=new Scanner(System.in);
    //   overriding the function in interface
    public void gear_change(){

        System.out.println("apply gear");
        System.out.println("you are on :"+gear+" gear");
        gear++;
        System.out.println("gear after applying : "+gear);
    }
    //   overriding the function in interface
    public void speed_up(){
        System.out.println("your current speed is : "+speed);
    //  System.out.println("whether you want to increase(1) or decrease(0) speed of bike");
        int selection;
        int speedchannge;
        int max_speed=180;
        System.out.println("-------------------------------------------------------");
        System.out.println("Enter the value of speed to be incremented or decremented");
        speedchannge=sc.nextInt();
        System.out.println("whether you want to increase(1) or decrease(2) speed of bike");
        System.out.println("Enter selection");
        System.out.println("-------------------------------------------------------");
        selection=sc.nextInt();
        if (max_speed<180 ) 
        {
            switch (selection){
                case 1:
                    speed+=speedchannge;
                System.out.println("your current speed of bike after increasing is : "+speed+"km/hr");
                break;
                case 2:
                    speed-=speedchannge;
                    System.out.println("your current speed of bike after decreasing is : "+speed+"km/hr");
                    break;
                default:
                    System.out.println("invalid");
                    break;
            }
        }
        else
        {
            System.out.println("You are reached at maximun speed");
        }
    }
    //   overriding the function in interface
    public void apply_breaks(){
        System.out.println("-------------------------------------------------------");
        System.out.println("to apply break select 1 for rear break amd 2 for front break");
        System.out.println("-------------------------------------------------------");
        int selection;
        selection=sc.nextInt();
        switch (selection){
            case 1:
                speed=speed-5;
                System.out.println("you are driving bike at the speed of :"+speed);
                break;
            case 2:
                speed=0;
                System.out.println("vehicle is stopped");
                break;
            default:
                System.out.println("invalid");
                break;

        }
    }
}

public class Interface 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        // instancing the classes
        bicycle b=new bicycle();
        car c=new car();
        bike k =new bike();
        int cont=1;
        while(cont==1)
        {
            System.out.println("-------------------------------------------------------");
            System.out.println("Select the type of vehicle::\n\t1.for cycle \n\t2.for car \n\t3.for bike");
            System.out.println("-------------------------------------------------------");
            int choice;
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    int cont1=1;
                    while(cont1==1)
                    {
                        int ch;
                        System.out.println("-------------------------------------------------------");
                        System.out.println("for bicycle, select \n\t5.for gear change \n\t6.for speeed up \n\t7.for applying breaks");
                        System.out.println("-------------------------------------------------------");
                        ch=sc.nextInt();
                        switch (ch)
                        {
                            case 5:
                                b.gear_change();
                                break;
                            case 6:
                                b.speed_up();
                                break;
                            case 7:
                                b.apply_breaks();
                                break;
                            default:
                                System.out.println("invalid");
                        }
                        System.out.println("-------------------------------------------------------");
                        System.out.println("Do you want to continue(0/1) for bicycle");
                        System.out.println("-------------------------------------------------------");
                        cont1=sc.nextInt();
                    }   
                    break;

                case 2:
                    int cont2=1;
                    while(cont2==1)
                    {
                        int ch1;
                        System.out.println("-------------------------------------------------------");
                        System.out.println("for car, select \n 5 for gear change\n 6 for speeed up\n 7 for applying breaks");
                        System.out.println("-------------------------------------------------------");
                        ch1=sc.nextInt();
                        switch (ch1)
                        {
                            case 5:
                                c.gear_change();
                                break;
                            case 6:
                                c.speed_up();
                                break;
                            case 7:
                                c.apply_breaks();
                                break;
                            default:
                                System.out.println("invalid");
                        }
                        System.out.println("-------------------------------------------------------");
                        System.out.println("Do you want to continue(0/1)for car");
                        System.out.println("-------------------------------------------------------");
                        cont2=sc.nextInt();
                        break;
                    }

                case 3:
                    int cont3=1;
                    while(cont3==1)
                    {
                        int ch2;
                        System.out.println("-------------------------------------------------------");
                        System.out.println("for bike, select \n\t5.for gear change \n\t6.for speeed up \n\t7.for applying breaks");
                        System.out.println("-------------------------------------------------------");
                        ch2=sc.nextInt();
                        switch (ch2)
                        {
                            case 5:
                                k.gear_change();
                                break;
                            case 6:
                                k.speed_up();
                                break;
                            case 7:
                                k.apply_breaks();
                                break;
                            default:
                                System.out.println("invalid");
                        }
                        System.out.println("-------------------------------------------------------");

                        System.out.println("Do you want to continue(0/1) for bike");
                        System.out.println("-------------------------------------------------------");
                        cont3=sc.nextInt();
                    }

                }
                System.out.println("Do you want to continue(0/1)");
                cont=sc.nextInt();
            }


        }
    }
