import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner (System.in);
        System.out.println("Digite o primeiro valor ");
        var number = scanner.nextInt();
        for (int i = 0 ; i <=10 ; i++)
        {
           int result = number * i;

            System.out.printf("Os valores %d x %d = %d \n",number, i, result);
        }


    }
}