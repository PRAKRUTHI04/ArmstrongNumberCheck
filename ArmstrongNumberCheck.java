import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = s.nextInt();
        int originalNumber = n, sum = 0;
        int length = String.valueOf(n).length();
        while (n > 0){
            int digit = n%10;
            sum += Math.pow(digit,length);
            n /= 10;
        }
        if(sum == originalNumber){
            System.out.println(originalNumber + " is a Armstrong number");
        }
        else{
            System.out.println(originalNumber + " is not a armstrong number");
        }
    }
}
