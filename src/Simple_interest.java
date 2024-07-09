import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Principle Amount: ");
        double principal = input.nextDouble();

        System.out.println("Enter Time: ");
        double time = input.nextDouble();

        System.out.println("Enter Interest Rate: ");
        double rate = input.nextDouble();

        double Simple_interest = (principal*time*rate)/100;
        System.out.println("Simple Interest is: "+Simple_interest);
    }
}
