import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give your number: ");
        int n = scanner.nextInt();
        int num = 0;
        String primeNumbers = "";

        for (int i=1; i<=n; i++){
            int counter = 0;
            for(num=i; num>=1; num--){
                if(i%num == 0){
                    counter++;
                }
            }
        if(counter == 2){
            System.out.println(i);
        }
        }

    }
}