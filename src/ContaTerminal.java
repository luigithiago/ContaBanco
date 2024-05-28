import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TO DO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela classe Scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada
        
        double saldo = 2368.89;

        Scanner scanner = new Scanner(System.in); //.useLocale(Locale.US);

        System.out.println("Por favor, digite sua conta");
        int numero = scanner.nextInt();
     
        System.out.println("Por favor, digite sua agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome");
        String nomeCliente = scanner.next();
        
       
        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", sua conta é " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
               
    }
}