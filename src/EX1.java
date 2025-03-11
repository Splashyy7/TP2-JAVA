import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Informe o nome da sua mãe: ");
        String nomeM = scanner.nextLine();

        System.out.println("Informe o nome do seu pai: ");
        String nomeP = scanner.nextLine();

        System.out.println("Informações:");
        System.out.println("Nome completo: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nome da mãe: " + nomeM);
        System.out.println("Nome do pai: " + nomeP);

        int tamanhoNome = nome.length();
        int tamanhoNomeM = nomeM.length();
        int tamanhoNomeP = nomeP.length();

        if (tamanhoNome > tamanhoNomeM && tamanhoNome > tamanhoNomeP) {
            System.out.println("O seu nome completo tem mais letras do que o nome da sua mãe ou do seu pai.");
        } else if (tamanhoNomeM > tamanhoNome && tamanhoNomeM > tamanhoNomeP) {
            System.out.println("O nome da sua mãe tem mais letras do que o seu nome ou o nome do seu pai.");
        } else if (tamanhoNomeP > tamanhoNome && tamanhoNomeP > tamanhoNomeM) {
            System.out.println("O nome do seu pai tem mais letras do que o seu nome ou o nome da sua mãe.");
        } else {
            System.out.println("Dois ou mais nomes têm o mesmo número de letras.");
        }

        scanner.close();
    }
}
