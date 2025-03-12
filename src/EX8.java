import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do primeiro lado: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Digite o comprimento do segundo lado: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Digite o comprimento do terceiro lado: ");
        double lado3 = scanner.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Isósceles.");
            } else {
                System.out.println("Escaleno.");
            }
        } else {
            System.out.println("As medidas fornecidas não formam um triângulo válido.");
        }

        scanner.close();
    }
}