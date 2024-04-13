import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String name = "Gabriel da Conceição Ramos";
        String tipoDeConta = "Corrente";
        double saldoInicial = 2500.00;

        int opcaoSelecionada = 0;

        while (true) {

            System.out.println("""
                    Operações: 
                    1. Consultar saldo atual
                    2. Receber valor
                    3. Transferir valor
                    4. Sair
                    """);
            System.out.println("Digite a opção selecionada: ");

            opcaoSelecionada = leitor.nextInt();

            if (opcaoSelecionada == 1) {
                System.out.println("O saldo atual é de R$" + saldoInicial);
            } else if (opcaoSelecionada == 2) {
                System.out.println("Digite o valor que você quer depositar: ");
                double saldoReceber = leitor.nextDouble();
                double saldoAtual = saldoInicial + saldoReceber;
                saldoInicial = saldoAtual;
                System.out.println("Seu valor atual é R$" + saldoInicial);
            } else if (opcaoSelecionada == 3) {
                System.out.println("Digite o valor que você quer transferir");
                double saldoTransferir = leitor.nextDouble();
                if (saldoTransferir > saldoInicial) {
                    System.out.println("Valor inválido, é menor que o seu atual saldo bancário.");
                } else if (saldoTransferir <= saldoInicial) {
                    double saldoAtual = saldoInicial - saldoTransferir;
                    saldoInicial = saldoAtual;
                    System.out.println("Seu valor atutal é R$ " + saldoInicial);
                }
            } else if (opcaoSelecionada == 4) {
                System.out.println("Saindo da sua conta bancária");
                break;
            } else {
                System.out.println("Opção inexistente, escolha entre a opção 1 a opção 4: ");
            }
        }
    }
}
