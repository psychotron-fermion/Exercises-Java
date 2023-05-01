import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Insert your text to print the individual characters out:");

        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
//        String text = input.toString();

        for(int i = 0; i < text.length(); i++){
            System.out.println(text.charAt(i));
        }

    }
}