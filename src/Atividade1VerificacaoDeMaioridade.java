import java.util.Scanner;

public class Atividade1VerificacaoDeMaioridade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer idade = 0;

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade");

        } else if (idade <18) {
            System.out.println("Você é menor de idade");
        }



    }
}