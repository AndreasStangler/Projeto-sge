import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        System.out.println("Cadastro de usuário");

        System.out.print(" Insira seu nome Completo: ");
        Scanner scanner = new Scanner(System.in);

        String nomeCompleto = scanner.nextLine();
        nomeCompleto = nomeCompleto.replaceAll("\\s+$", "");
        int tamanhoNome = nomeCompleto.length();


        System.out.println("Seu nome de usuário será: ");

        String inicial = String.valueOf(nomeCompleto.charAt(0));
        String ultimo = nomeCompleto.substring(nomeCompleto.lastIndexOf(" "), tamanhoNome).trim();
        String usuario = inicial.toLowerCase() + "_" + ultimo.toLowerCase();

        System.out.println(usuario);

        System.out.print("Insira uma senha (deve ter no minimo 8 caracteres com pelo menos 1 letra maiúscdula, 1 letra minúscula, números e um caractere especial (ex: @ , !): ");

        String senha = scanner.nextLine();

        senha = senha.replaceAll("\\s+$", "");
        if (senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-!@])(?=.*[A-Z])(?=.*\\d).+") && senha.length() >= 8) {

            System.out.println("Senha válida");
        } else {
            System.out.println("Senha invalida");
        }

        if (loginUser(usuario) && loginPwd(senha)){
            System.out.println("Login realizado com sucesso!");
        }



    }
    public static boolean loginUser(String usuario) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Login:");
        String vuser = scanner.nextLine();
        if (vuser.equals(usuario)){
            return true;
        } else {
            System.out.println("Usuário não encontrado.");
            return false;

        }
    }

    public static boolean  loginPwd(String senha){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Senha:");
        String vSenha = scanner.nextLine();
        if (vSenha.equals(senha)){
            return true;
        } else {
            System.out.println("Senha incorreta.");
            return false;
        }
    }
}