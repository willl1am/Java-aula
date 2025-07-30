import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe sua altura (em metros): ");
        double altura = scanner.nextDouble();
        System.out.println("Informe seu peso (em kg): ");
        double peso = scanner.nextDouble();
        double imc = peso / (altura * altura);
        if (imc <= 18.5) {
            System.out.printf("Abaixo do peso, seu IMC é %.2f\n", imc);
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.printf("Peso ideal, seu IMC é %.2f\n", imc);
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.printf("Levemente acima do peso, seu IMC é %.2f\n", imc);
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.printf("Obesidade Grau I, seu IMC é %.2f\n", imc);
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.printf("Obesidade Grau II, seu IMC é %.2f\n", imc);
        } else if (imc >= 40.0) {
            System.out.printf("Obesidade Grau III (mórbida), seu IMC é %.2f\n", imc);
        }

        scanner.close();
    }
}