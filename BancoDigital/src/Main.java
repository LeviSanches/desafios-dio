public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        banco.listarContas();
    }
}