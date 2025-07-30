import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner (System.in);
        System.out.println("Digite o valor ");
        var number = scanner.nextFloat();
        for (int i = 0 ; i <=10 ; i++)
        {
           Float result = number * i;

            System.out.printf("Os valores %s x %s = %s \n",number, i, result);
        }


    }
}