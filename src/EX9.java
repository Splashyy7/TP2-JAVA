import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cadastre sua senha: ");
        String senha = scanner.nextLine();

        String senhaDigitada;

        do {
            System.out.print("Digite a senha novamente: ");
            senhaDigitada = scanner.nextLine();
        } while (!senhaDigitada.equals(senha));

        System.out.println("Senha cadastrada com sucesso!");

        scanner.close();
    }
}