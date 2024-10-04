
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Entre com o numero da conta!");
        int conta = sc.nextInt();

        System.out.println("Entre com a agencia!");
        String agencia = sc.next();
        sc.nextLine();

        System.out.println("Entre com o nome do cliente!");
        String nome = sc.next();
        //sc.nextLine();

        System.out.println("Entre com o sobrenome do cliente!");
        String sobrenome = sc.next();
        //sc.nextLine();

        System.out.println("Entre com o valor do Saldo!");
        double saldo = sc.nextDouble();

        System.out.println("Ola " + nome + " " + sobrenome + " " 
        + "obrigado por criar uma conta em nosso banco, sua agencia e " + agencia 
        + " , conta " + conta + "e seu saldo R$ " + saldo + " ja esta disponivel para saque");
        sc.close();
    }
}
