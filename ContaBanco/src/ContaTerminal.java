import java.util.Scanner;

public class ContaTerminal {

    public static Integer numero;
    public static String agencia;
    public static String nomeCliente;
    public static Double saldo;

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite o número da conta: ");
        numero = scanner.nextInt();
        System.out.println("Digite a agência: ");
        agencia = scanner.next();
        System.out.println("Digite o nome do cliente: ");
        nomeCliente = scanner.next();
        System.out.println("Digite o saldo: ");
        saldo = scanner.nextDouble();

        String mensagem = "Olá "
                .concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo ")
                .concat(String.valueOf(saldo))
                .concat(" já está disponível para saque.");

        System.out.println(mensagem);
    }


}
