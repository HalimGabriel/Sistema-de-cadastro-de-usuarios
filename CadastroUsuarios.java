import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
    String nome;
    int idade;
    String email;

    Usuario(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", E-mail: " + email;
    }
}

public class CadastroUsuarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== Sistema de Cadastro de Usuários ===");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite a idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Digite o e-mail: ");
                    String email = scanner.nextLine();

                    Usuario usuario = new Usuario(nome, idade, email);
                    usuarios.add(usuario);
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Usuários ---");
                    if (usuarios.isEmpty()) {
                        System.out.println("Nenhum usuário cadastrado.");
                    } else {
                        for (Usuario u : usuarios) {
                            System.out.println(u);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        scanner.close();
    }
}
