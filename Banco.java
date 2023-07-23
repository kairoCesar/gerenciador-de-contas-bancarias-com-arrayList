import java.util.ArrayList;

public class Banco {

    ArrayList<ContaBancaria> contasBancarias = new ArrayList<>();

    void adicionarContaBancaria(ContaBancaria contaBancaria) {
        contasBancarias.add(contaBancaria);
    }

    void pesquisarContaBancaria(int numeroDaConta) {
        for (ContaBancaria contasBancaria : contasBancarias) {
            if (contasBancaria.numero == numeroDaConta) {
                System.out.printf("Número da conta: %d%nTitular: %s%nSaldo: %.2f%n",
                        contasBancaria.numero, contasBancaria.nomeDoTitular, contasBancaria.saldo);
            }


        }
    }

    void exibirTodasAsContas() {
        for (ContaBancaria contasBancaria : contasBancarias) {
            System.out.printf("A conta número %d, do titular %s, está cadastrada neste banco e possuí " +
                    "saldo de R$%.2f%n", contasBancaria.numero, contasBancaria.nomeDoTitular, contasBancaria.saldo);
        }
    }

    void exibirSaldoTotalDeTodasAsContas() {
        double saldoTotal = 0;
        for (ContaBancaria contasBancaria : contasBancarias) {
            saldoTotal += contasBancaria.saldo;
        }
        System.out.printf("Saldo total de todas as contas: R$ %.2f", saldoTotal);
    }


}
