import java.util.Scanner;

public class Atividade3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print ("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print ("Digite sua terceira nota: ");
        double nota3 = scanner.nextDouble();
        double resultado = (nota1 + nota2 + nota3) / 3;
        System.out.printf ("A média aritmética é: %.2f\n", resultado);
        scanner.close();
    }
}
