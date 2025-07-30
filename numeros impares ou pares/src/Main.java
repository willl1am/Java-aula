import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.println("Me informe o primeiro numero");
    var number_one = scanner.nextDouble();
    double numberTwo;
    while (true)
    {
     System.out.println("Me infrome o segundo Numero");
         numberTwo = scanner.nextDouble();

        if (numberTwo > number_one)
        {
        System.out.printf("Número válido, pode continuar \n", number_one);
          break;

        } else {
        System.out.println("informe um numero maior que o primeiro");
         }
    }
     System.out.println("Você deseja ver os numeros pares ou impares ?");
    String opcao = scanner.next().toLowerCase();
    System.out.println("Numeros no intervalo (" + numberTwo + " até " + number_one + ") em ordem crescente");
    for (int i = (int)number_one; i <= numberTwo; i++)
    {
        if (opcao.equals("par") && i % 2 == 0)
        {
            System.out.println(i);
        }
    else if ( opcao.equals("impar")&& i % 2 !=0 )
        {
            System.out.println(i);
        }
    }

    }
}