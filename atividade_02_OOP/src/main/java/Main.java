import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PessoaDAO dao = new PessoaDAO();

        System.out.println("=== SISTEMA DE CADASTRO ===");

        int opc = 0;

        while (opc != 3) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Consultar Pessoas");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");

            String input = sc.nextLine().trim();

            try {
                opc = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido (1, 2 ou 3)!");
                continue;
            }

            switch (opc) {
                case 1:
                    cadastrarPessoa(sc, dao);
                    break;
                case 2:
                    dao.consultar();
                    break;
                case 3:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Use 1, 2 ou 3.");
            }
        }

        sc.close();
    }

    private static void cadastrarPessoa(Scanner sc, PessoaDAO dao) {
        System.out.println("\n--- CADASTRAR PESSOA ---");
        System.out.println("1 - Aluno");
        System.out.println("2 - Professor");
        System.out.print("Escolha o tipo: ");

        String tipoInput = sc.nextLine().trim();
        int tipo;

        try {
            tipo = Integer.parseInt(tipoInput);
        } catch (NumberFormatException e) {
            System.out.println("Tipo inválido! Use 1 para Aluno ou 2 para Professor.");
            return;
        }

        if (tipo != 1 && tipo != 2) {
            System.out.println("Tipo inválido! Use 1 para Aluno ou 2 para Professor.");
            return;
        }

        System.out.print("Nome: ");
        String nome = sc.nextLine().trim();

        if (nome.isEmpty()) {
            System.out.println("Nome não pode ser vazio!");
            return;
        }

        System.out.print("Idade: ");
        String idadeInput = sc.nextLine().trim();
        int idade;

        try {
            idade = Integer.parseInt(idadeInput);
            if (idade <= 0 || idade > 120) {
                System.out.println("Idade deve ser entre 1 e 120 anos!");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Idade inválida! Digite um número.");
            return;
        }

        Pessoa pessoa = (tipo == 1) ? new Aluno(nome, idade) : new Professor(nome, idade);
        dao.cadastrar(pessoa);
    }
}