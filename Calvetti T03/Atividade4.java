import java.util.Scanner;

public class Atividade4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Digite o valor em reais: ");
        double reais = scanner.nextDouble();
        System.out.print ("Digite a cotação atual do dólar: ");
        double dolar = scanner.nextDouble();
        double resultado = reais / dolar;
        System.out.printf ("O resultado da conversão é: %.2f\n", resultado);
        scanner.close();
    }
}
