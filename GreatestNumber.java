import java.util.Scanner;
class  GreatestNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a = sc.nextInt();

		System.out.print("Enter Second Number : ");
		int b  = sc.nextInt();

		System.out.print("Enter Third Number : ");
		int c = sc.nextInt();


		int big = a > b ? ( a > c ? a : c) : (b > c ? b : c);

		System.out.println("\n The greatest number is " + big);
	}
}