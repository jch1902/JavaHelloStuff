
import java.util.Scanner;
public class HelloAgain{
	public static void main(String[] args) {
		System.out.println("args.length: "+ args.length);
		//you can also put it as args.length != 0 to say if it doesn't equal 0
		if (args.length < 0 || args.length > 0){
			System.out.println("TODO:"); 
			//adds up the numbers but using args instead of integers
			int sum = Integer.parseInt(args[0]) +
					Integer.parseInt(args[1]);
			System.out.println("Sum is " + sum);
			return; //all done for now
		}
		System.out.print("enter two numbers: ");
		Scanner myNum = new Scanner(System.in);
		int number1 = myNum.nextInt();
		int number2 = myNum.nextInt();
		int sum = number1 + number2;
		System.out.println(sum);
		//If the sum is 0, it will ask for another number and continue until the sum isn't 0
		while(sum == 0){
			System.out.print("enter two numbers again: ");
			Scanner newNum = new Scanner(System.in);
			int num1 = newNum.nextInt();
			int num2 = newNum.nextInt();
			int su = num1 + num2;
			System.out.println(su);
			if(su != 0){
				sum = su;
			}
		}
	}
}