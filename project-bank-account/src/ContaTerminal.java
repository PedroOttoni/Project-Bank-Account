import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        /*
        Número da Conta = 1021;
        Número Agência = 067-8;
        Nome do Cliente = Mario Andrade;
        Saldo = 237.48;
        */

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua agência: ");
        String numeroAgencia = sc.next();

        System.out.println("Por favor, agora digite o número da sua conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Por favor, informe o seu primeiro nome: ");
        String primeiroNomeCliente = sc.next();

        System.out.println("Por favor, informe o seu sobrenome: ");
        String sobrenomeCliente = sc.next();

        System.out.println("Por fim, digite o seu saldo: ");
        double saldoConta = sc.nextDouble();


        System.out.println("Olá, " + primeiroNomeCliente + " " + sobrenomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.");
    }
}