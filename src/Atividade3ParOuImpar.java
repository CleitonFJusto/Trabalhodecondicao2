import java.util.Scanner;

public class Atividade3ParOuImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer numero = 0;


        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é par");

        }else {
            System.out.println("é impar ");

        }

    }
}
