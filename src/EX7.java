import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu salário bruto anual: R$ ");
        double salarioBruto = scanner.nextDouble();

        double imposto = 0;

        if (salarioBruto <= 24000) {
            imposto = 0;
        } else if (salarioBruto <= 36000) {
            imposto = (salarioBruto - 24000) * 0.075;
        } else if (salarioBruto <= 48000) {
            imposto = (salarioBruto - 36000) * 0.15 + (36000 - 24000) * 0.075;
        } else if (salarioBruto <= 60000) {
            imposto = (salarioBruto - 48000) * 0.225 + (48000 - 36000) * 0.15 + (36000 - 24000) * 0.075;
        } else {
            imposto = (salarioBruto - 60000) * 0.275 + (60000 - 48000) * 0.225 + (48000 - 36000) * 0.15 + (36000 - 24000) * 0.075;
        }

        double salarioLiquido = salarioBruto - imposto;

        System.out.println("Imposto de Renda a pagar: R$ " + imposto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}