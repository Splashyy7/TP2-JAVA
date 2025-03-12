import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da compra: ");
        double valor = scanner.nextDouble();

        double desconto = 0;
        double valorFinal;

        if (valor > 1000) {
            desconto = valor * 0.10;
        } else if (valor >= 500 && valor <= 1000) {
            desconto = valor * 0.05;
        }

        valorFinal = valor - desconto;

        System.out.println("Valor original: R$ " + valor);
        System.out.println("Desconto aplicado: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);

        scanner.close();
    }
}
