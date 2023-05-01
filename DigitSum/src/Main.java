import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int sum = 0;
        int index = 1;

        //for (int i = 0; i > 0; i++){
        while(number > 0){
            if (number % 10 == 0) {
                sum = sum;
                number = number / 10;
            } else {
                sum = sum + number % 10;
                number = number / 10;
            }
            System.out.println(sum);
        }
    }
}