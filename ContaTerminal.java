import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome !");
        String nome = sc.next();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.next();

        System.out.println("Por favor, digite o número da Conta !");
        int conta = sc.nextInt();

        System.out.println("Por favor, digite o saldo !");
        Double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + conta + " e seu saldo é " + saldo + " já está disponível para saque.");

    }
}
