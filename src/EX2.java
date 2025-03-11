import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a nota do 1° bimestre: ");
        double primeiroBi = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Informe a nota do 2° bimestre: ");
        double segundoBi = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Informe a nota do 3° bimestre: ");
        double terceiroBi = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Informe a nota do 4° bimestre: ");
        double quartoBi = scanner.nextDouble();

        scanner.nextLine();

        double media = (primeiroBi + segundoBi + terceiroBi + quartoBi)/4;

        System.out.println("Notas:");
        System.out.println("1° bimestre: " + primeiroBi);
        System.out.println("2° bimestre " + segundoBi);
        System.out.println("3° bimestre: " + terceiroBi);
        System.out.println("4° bimestre " + quartoBi);
        System.out.println("Média aritmética: " + media);


        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media > 5.9 && media < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}