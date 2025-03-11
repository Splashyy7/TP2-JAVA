import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Digite a primeira data (dd/MM/yyyy): ");
        String data1N = scanner.nextLine();
        System.out.print("Digite a segunda data (dd/MM/yyyy): ");
        String data2H = scanner.nextLine();

        LocalDate data1 = LocalDate.parse(data1N, formatter);
        LocalDate data2 = LocalDate.parse(data2H, formatter);

        long quantidadeDias = ChronoUnit.DAYS.between(data1, data2);

        System.out.println("Número de dias entre as datas: " + quantidadeDias);
    }
}
