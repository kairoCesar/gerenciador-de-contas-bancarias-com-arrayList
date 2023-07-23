public class Main {
    public static void main(String[] args) {
        Banco bancoBCC = new Banco();

        ContaBancaria contaDoKairo = new ContaBancaria();
        contaDoKairo.numero = 45856;
        contaDoKairo.nomeDoTitular = "Kairo César";
        contaDoKairo.depositarValor(8000.00);
        contaDoKairo.sacarValor(3000.00);
        contaDoKairo.consultarSaldo();
        bancoBCC.adicionarContaBancaria(contaDoKairo);


        ContaBancaria contaDaMaria = new ContaBancaria();
        contaDaMaria.nomeDoTitular = "John Wick";
        contaDaMaria.numero = 47856;
        contaDaMaria.depositarValor(7500.45);
        contaDaMaria.consultarSaldo();
        bancoBCC.adicionarContaBancaria(contaDaMaria);



    }
}