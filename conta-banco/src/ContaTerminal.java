import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in) .useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua conta e pressione ENTER: ");
        int numero = scanner.nextInt();

        System.out.println("Agora, digite o número da sua agência e pressione ENTER: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente e aperte ENTER !");
        String nome = scanner.next();

        System.out.println("Por fim, digite o saldo da sua conta e pressione ENTER: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");


    }
}
