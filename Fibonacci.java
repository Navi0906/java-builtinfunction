import java.util.Scanner;
class Fibonacci{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		generate(number);
	}
	
	public static void generate(int number){
		int first = 0;
		int second = 1;
		for(int i=0;i<number;i++){
			int temp;
			System.out.print(second + " ");
			temp = first + second;
			first = second;
			second = temp;
			
		}
	}
}