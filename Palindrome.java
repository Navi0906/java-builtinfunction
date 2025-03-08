import java.util.*;
class Palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.next();
		System.out.print(check(str));
	}
	
	public static boolean check(String str){
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=str.charAt(str.length()-i-1)){
				return false;
			}
		}
		return true;
	}
}