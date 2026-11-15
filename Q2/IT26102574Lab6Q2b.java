import java.util.Scanner;

public class IT26102574Lab6Q2b{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int c =1;
		int[] numbers = new int[10];
		
		System.out.println("Enter 10 nubers:");
		
		while(c <= 10){
			System.out.print("Enter number"+  c + ":");
			numbers[c-1]= input.nextInt();
			c++;
		
			}
			
			System.out.println("\nThe numbers you entered are:");
			c=0;
			
			while(c<10){ 
				System.out.print(numbers[c] +" ");
				c++;
				
			}
		input.close();
		
		
	}


}