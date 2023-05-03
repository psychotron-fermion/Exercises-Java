import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Solution1
//        System.out.println("Insert 10 numbers to get their sum");
//        int[] newArray = new int[10];
//
//        for(int i = 0; i < 10; i++){
//            Scanner scanner = new Scanner(System.in);
//            int number = scanner.nextInt();
//            newArray[i] = number;
//        }
//
//        int sum = 0;
//
//        for(int i = 0; i < newArray.length; i++){
//            sum = sum + newArray[i];
//        }
//
//        System.out.println(sum);

//        Solution2
        Scanner scanner = new Scanner(System.in);
        int[] my_array = new int[10];
        int sum = 0;

        for(int i=0; i<my_array.length; i++){
            my_array[i] = scanner.nextInt();
        }
        for(int i : my_array){
            sum = sum + i;
        }

    }
}