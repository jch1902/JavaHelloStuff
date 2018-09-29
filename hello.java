// Hello.java
//this line is a comment.
//Ignored by Java Compiler(javac)

//gain access to the pre-written Scanner class
import java.util.Scanner;

public class hello{
	//This is a method
	//Static means this method is always here
	
	public static void main(String[] args){

		//Say Hello world
		System.out.println("Hello World");
		System.out.print("Hello ");
		System.out.print("World!");
		System.out.println();
	
		//Ask user for name
		//Create an instance of a Scanner	
		Scanner input = new Scanner(System.in);	
		//System.out.println(input);
		System.out.print("Enter your name:");
		String name = input.next();
		System.out.println(name);
		
		//Enter first and last
		input = new Scanner(System.in);
		System.out.print("Enter first and last:");
		String line = input.nextLine();
		System.out.println(line);
	}
	
	
}
