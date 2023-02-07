import java.util.*;

public class OOPL_7 {

    // variable to count result
    static int counter = 0;


    // function for array of integers
    static void int_opt() {
        int elem, n, opt;
        Scanner sc = new Scanner(System.in);
        
        // ArrayList of integer type from Collection interface
        ArrayList<Integer> int_arr = new ArrayList<Integer>();    

        System.out.println("Enter the operation to be performed");
        System.out.println("1 Check if numbers are ODD or EVEN");
        System.out.println("2 Check if numbers are Prime or not");  
        opt = sc.nextInt();
        
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        System.out.println("Enter the elements: ");

        for(int i = 0; i < n; i++) {
            elem = sc.nextInt();
            // add elements to the ArrayList
            int_arr.add(elem);
        }

        // Iterator from the Collection interface
        Iterator itr = int_arr.iterator();
        counter = 0;
        // while loop till there are elements in ArrayList
        while(itr.hasNext()) { 
            // call the check function for each element
            switch(opt) {
                case 1:
                    // call is_even function for the element    
                    is_even( (int)itr.next() );
                    break;
                case 2:
                    // call prime function for the element
                    is_prime( (int)itr.next() );
                    break;
                default:
                    System.out.println("Enter correct option");
            }
        }

        // display the count
        if(opt == 1) {
            System.out.println("The number of EVEN numbers is: " + counter);
            System.out.println("The number of ODD numbers is: " + (int_arr.size() - counter));
        }
        else {
            System.out.println("The number of Prime numbers is: " + counter);
            System.out.println("The number of Non-Prime numbers is: " + (int_arr.size() - counter));
        }
    }


    // function to check if number is EVEN or ODD
    static void is_even(int x) {
        if(x % 2 == 0) {
            System.out.println(x +" is an EVEN number");
            // increment if number is EVEN
            counter += 1;
        }
        else {
            System.out.println(x +" is an ODD number");
        }
    }


    // function to check if number is prime
    static void is_prime(int x) {
        boolean flag = true;
        if(x == 1) {
            System.out.println("1 is unique number");
        }
        else {
            for(int i = 2; i < x; i++) {
                if(x%i == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println(x +" is a Prime number.");
                // increment if number is prime
                counter += 1;
            }
            else {
                System.out.println(x +" is not a Prime number.");
            }
        }
    }


    // function for array of stringss
    static void str_opt() {
        int n;
        String str;

        // ArrayList of String type from Collection interface
        ArrayList<String> str_arr = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++) {
            str = sc.next();
            // add elements to the ArrayList
            str_arr.add(str);
        }

        counter = 0;
        // for loop throung the ArrayList
        for(String str1 : str_arr) {
            // call the check function for each element
            check_palindrome(str1);
        }
        System.out.println("The number of Palindromes is: " + counter);
    }


    // function to check if string is palindrome
    static void check_palindrome(String x) {
        StringBuilder s1 = new StringBuilder(x);
        if(x.equals(s1.reverse().toString())) {
            System.out.println(x + " is a Palindrome");
            // increment counter if it is palindrome
            counter += 1;
        }
        else {
            System.out.println(x + " is not a Palindrome");
        }
    }    



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        while (true) {
            // select type of list
            System.out.println("\nChoose Type of elements in list");
            System.out.println("1 Integer elements");
            System.out.println("2 String elements");
            System.out.println("3 Exit");
            ch = sc.nextInt();

            // for integer ArrayList
            if(ch == 1)
                int_opt();
            // for String ArrayList
            else if(ch == 2)
                str_opt();
            else if(ch == 3) {
                System.out.println("\nProgram ended");
                break;
            }
            else
                System.out.println("\nInvalid input");
        }
    }
}