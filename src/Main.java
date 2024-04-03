import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number1, number2, total = 1;
        System.out.print("Üssü alınacak sayi : ");
        number1 = inp.nextInt();
        System.out.print("Üs olacak sayı : ");
        number2 = inp.nextInt();
        for (int i = 1; i <= number2; i++) {
            total = total * number1;
        }
        System.out.println(total);
    }
}