import java.util.Scanner;

public class Atividade4VerificacaoDeLogin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String usuario = "Cleiton";
        String senha = "cleitonjusto123";


        String inputUsuario;
        String inputSenha;


        System.out.println("Insira um nome de usuário: ");
        inputUsuario = sc.nextLine().trim();


        System.out.println("Insira uma senha: ");
        inputSenha = sc.nextLine().trim();


        if (inputUsuario.equals(usuario)) {
            if (inputSenha.equals(senha)) {
                System.out.println("Login bem-sucedido! :)");
            } else {
                System.out.println("Senha incorreta. :( ");
            }
        } else {
            System.out.println("Nome de usuário ou senha incorreto. :( ");
        }


        sc.close();
    }
}
