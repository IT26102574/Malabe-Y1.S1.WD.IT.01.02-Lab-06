import java.util.Scanner;
public class IT26102574Lab6Q1{
	public static void main (String[]args){
	Scanner input = new Scanner(System.in);
	double num, squareNum, squarerootNum;
	System.out.print("Enter a number:");
	num = input.nextDouble();
	squareNum= num*num;
	squarerootNum= Math.sqrt(num);
	
	System.out.println("The square of" + num + "is:" + squareNum);
	System.out.println("The square root of"+ num + "is" + squarerootNum);
	}

}