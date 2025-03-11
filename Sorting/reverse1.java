import java.util.Scanner;

public class reverse1 {

        public static void reverseMethod(int number) {
            if (number < 10) {
            System.out.println(number);
            return;
            }
            else {
            System.out.print(number % 10);
                //Method is calling itself: recursion
            reverseMethod(number/10);
            }
        }

}
class print{
    public static void main(String arg[]) {
    reverse1 r1 = new reverse1();
    int num=0;
	System.out.print("Input your number and press enter: ");
	Scanner in = new Scanner(System.in);
	num = in.nextInt();
	System.out.print("Reverse of the input number is: ");
	r1.reverseMethod(num);
	System.out.println();
    }
}
