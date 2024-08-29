import java.util.Scanner;

public class Atividade2ClassificacaoDeNotas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double nota = 0.0;
        System.out.println("Digite sua nota: ");
        nota = sc.nextDouble();

        if (nota >= 9 && nota <= 10) {
            System.out.println("Excelente");
        }else if (nota >= 7) {
            System.out.println("Bom");
        }else if (nota >=5) {
            System.out.println("Satisfatório");
        }else if (nota < 5) {
            System.out.println("Insatisfatório");
        }
        

    }

}