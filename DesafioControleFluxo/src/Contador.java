import java.util.Scanner;

public class Contador {

    public static Integer numero1;
    public static Integer numero2;
    public static Integer parametro;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ParametrosInvalidosException {

        System.out.println("Digite o primeiro parâmetro numérico:");
        numero1 = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro numérico");
        numero2 = scanner.nextInt();

        if (numero2 < numero1) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        else {
            parametro = numero2 - numero1;
            for (int i = 0; i < parametro; i ++) {
                System.out.println("Imprimindo o número " + (i + 1));
            }
        }


    }
}