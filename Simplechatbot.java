import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Simplechatbot {
    final static Scanner sc = new Scanner(System.in); 
    final static DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) 
    {
        welcome();
        Name();
        capitalOfCountries();
        simplecalculator();
        javaquestion();
        thanking();
    }

    static void welcome() 
    {
        System.out.println("Hello! My name is chatbot.");
        System.out.println("I was created in 2023.");
        System.out.println("Please, tell me your name.");
    }

    static void Name() 
    {
        String name = sc.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void capitalOfCountries() 
    {
        System.out.println("Let's see. Can you name a country? (Type 'exit' to finish)");
        String country=sc.nextLine().trim().toLowerCase();
        while(!country.equals("exit")){
        		String capital=getCapital(country);
                if(capital !=null) {
                	System.out.println("The capital of " + country + " is " + capital + ".");
                }else {
                	System.out.println("I'm sorry,I don't know the capital of " + country + ".");
                }
        System.out.println("Can you name an another country? (Type 'exit' to finish)");
        country=sc.nextLine().trim().toLowerCase();
        if(country.equals("exit")) {
        	break;
        }
      
        }
    }
    static String getCapital(String country) {
    	switch (country) {
    	case "france":
    		return "paris";
    	case "germany":
    		return "berlin";
    	case "usa":
    		return "washington";
    	case "india":
    		return "delhi";
    	case "spain":
    		return "madrid";
    	case "russia":
    		return "moscow";
    	case "england":
    		return "london";
    	case "new zealand":
    		return "wellington";
    	case "australia":
    		return "canberra";
    	case "portugal":
    		return "lisbon";
    	case "pakistan":
    		return "islamabad";
    	case "afghanistan":
    		return "kabul";
    	case "uae":
    		return "abu dhabi";
    	case "srilanka":
    		return "colombo";
    	case "bangladesh":
    		return "dhaka";
    	case "south africa":
    		return "cape town";
    		default:
    			return null;
    			
    	}
    }

    static void simplecalculator() 
    {
        System.out.println("Let's do some simple calculations! Enter two numbers and an operation(+,-,*,/):");
        int num1=sc.nextInt();
        char operation=sc.next().charAt(0);
        int num2=sc.nextInt();
        int result;
        switch(operation) {
        case '+':
        	result=num1+num2;
        	break;
        case '-':
        	result=num1-num2;
        	break;
        case '*':
        	result=num1*num2;
        	break;
        case '/':
        	if(num2 !=0) {
        		result=num1/num2;
        	}else {
        		System.out.println("cannot divide by zero.please try again.");
        		return;
        	}
        	break;
        	default:
        		System.out.println("Invalid operation.please try again.");
        		return;
        }
        System.out.println("Result: "+result);
    }

    static void javaquestion() 
    {   System.out.println("Let's check your programming knowledge.Here's a Java-related question:");
        System.out.println("What is the purpose of the 'volatile' keyword in Java?");
        System.out.println("1. To make a variable constant.\n" +
                           "2. To ensure that a thread sees the most up-to-date value of a variable.\n" +
                           "3. To prevent a class from being subclassed.\n" +
                           "4. To specify the initial value of a variable.");
        int answer =sc.nextInt();
        if(answer==2) {
        	System.out.println("correct!");
        }else {
        	System.out.println("sorry,that's incorrect");
        }
    }
      
    static void thanking() 
    { 
    	LocalDateTime now=LocalDateTime.now();
    	 System.out.println("Thank you for interacting with me! have a wonderful day!");
        System.out.println("current date and time: "+now.format(formatter));
       
    }
}
