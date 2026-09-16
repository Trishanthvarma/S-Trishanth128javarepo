import java.util.Scanner;

class Scan
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a byte value: ");
        byte b = sc.nextByte();

        char a = (char)b;

        System.out.println("b = " + b);
        System.out.println("a = " + a);
        System.out.println("ASCII value of a = " + (int)a);

        sc.close();
    }
}