import java.util.Scanner;

public class PrimePalindrome {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) 
            if (num % i == 0) return false;
        return true;
    }
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = (reversed * 10) + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int number,t;
		System.out.print("Enter no of test cases: ");
        t = scanner.nextInt();
		while(t--!=0){
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        if (isPrime(number) && isPalindrome(number)) {
            System.out.println(number + " is a Prime Palindrome.");
        } else {
            System.out.println(number + " is NOT a Prime Palindrome.");
        }
		}
        scanner.close();
    }
}