import java.util.*;
public class Generic{
	static int count = 0; //COUNT VARIABLE
	//FUNCTION TO CHECK PALINDROME
	static void check_palindrome(String x){
		StringBuilder s1 = new StringBuilder(x);
		if(x.equals(s1.reverse().toString())){
			System.out.println(x+" is a Palindrome");
			count += 1; //count the number of palindrome
		}
		else{
			System.out.println(x+" is not a Palindrome");
		}
	}
	
	static void length(String x) {
		StringBuilder s1 = new StringBuilder(x);
		int len =  x.length();
		System.out.println();
		System.out.print("The lenght of " + x + " is " + len);
		System.out.println();

	}
	
	
	//FUNCTION TO CHECK EVEN OR ODD
	static void even_odd(int x){
		if(x % 2 == 0){
			System.out.println(x+" IS EVEN");
			count += 1; //count the number of even numbers
		}
		else{
			System.out.println(x+" IS ODD");
		}
	}
	//FUNCION TO CHECK PRIME NUMBER
	static void prime(int x){
		boolean flag = false;
		for(int i = 2; i <= x/2; ++i){
			if(x % i == 0){
				flag = true;
				break;
			}
		}
		if (!flag){
			System.out.println(x + " is a prime number.");
			count += 1; //count the number of prime numbers
		}
		else{
			System.out.println(x + " is not a prime number.");
		}
	}

	//FUNCTION TO DECIDE WHICH FUNCTION TO CHECK
	static void check(int ch,int x){
		switch(ch){
		case 1:
			even_odd(x); //call even_odd function for number x
			break;
		case 2:
			prime(x); //call prime function for number x
			break;
		case 3:
			String element = Integer.toString(x);
			check_palindrome(element);
			break;
		}
	} //FUNCTION FOR INTEGER ARRAY
	static void number_op(){
		int element,n,choice;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		//ArrayList from Collection Interface
		//Integer type
		ArrayList<Integer> nums = new ArrayList<Integer>(); 

		System.out.println("Enter the number of elements:");
		n = sc.nextInt();
		System.out.println("Enter the elements:");

		for(int i=0;i<n;i++){
			element = sc.nextInt();
			nums.add(element); //Add elements to the ArrayList
		}
		
		do{
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("Enter the Operation to be performed:");
		System.out.println();
		System.out.println("1. ODD or EVEN\n2. PRIME OR NOT\n3. PALINDROME\n4. Exit");
		System.out.println("-------------------------------");
		System.out.println();
	
		choice = sc.nextInt();

		@SuppressWarnings("rawtypes")
		Iterator itr = nums.iterator(); //Iterator from the COLLECTION interface
		count = 0;
		while(itr.hasNext()){ //Loop till there are elements in the ArrayList
			check(choice,(int)itr.next()); //call the check function for each element
		}
		loop:
		switch (choice)
		{
		case 1: 
			System.out.println();
			System.out.println("The number of even numbers is: "+ count);
				System.out.println("The number of Odd numbers is: "+ (nums.size()-count));
				break;
			
		case 2:	
			System.out.println();
			System.out.println("The number of prime numbers is: "+ count);
				System.out.println("The number of not prime numbers is: "+ (nums.size()-count));
				break;
				
		case 3:
			System.out.println();
			System.out.println("The number of Palindrome numbers is: "+ count);
				System.out.println("The number of not palindrome numbers is: "+ (nums.size()-count));
				break;
			
		case 4:
			System.out.println();
			System.out.println("END!!");
			break loop;
			
		default:
			System.out.print("Enter valid choice");
			
		}
		}while(choice!=4);
	}

	//FUNCTION FOR STRING ARRAY
	static void string_op(){
		int n;
		String word;

		//ArrayList from COLLECTION interface
		//String type
		ArrayList<String> words = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		n = sc.nextInt();
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++){
			word = sc.next();
			words.add(word); //Add elements to the ArrayList
		}
		count = 0;
		for(String w:words){ 
			check_palindrome(w);
			length(w);
		}

		System.out.println("The number of palindromes is: "+ count);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int ch;

		//Choose the type of List needed
		do
		{
			System.out.println("===================================");
            System.out.println("Enter your choice");
            System.out.println("Choose Type:\n \n 1.Integer \n 2.String \n 3.Exit");
            System.out.println("===================================");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1: 
					number_op();
					break;
					
				case 2:
					string_op();
					break;
					
				case 3:
					System.out.println("TERMINATED");
					break;
					
			}
		}while(ch!=3);
	}
}

