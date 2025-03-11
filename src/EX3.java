import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor em reais: ");
        double real = scanner.nextDouble();

        scanner.nextLine();

        double dolar = (real)*5.86;
        double euro = (real)*6.38;
        double libra = (real)*7.54;

        System.out.println("Valores convertidos:");
        System.out.println("Dólar: "+ dolar );
        System.out.println("Euro: "+ euro );
        System.out.println("Libra: "+ libra );


        scanner.close();
    }
}