import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO: Conhecer e importar a classe Scanner
       //Exibir as mensagens para o nosso usuario
       //Obter pela scanner os valores digitados no terminal 
       //Exibir a mensagem da conta criada

       Scanner scanner = new Scanner (System.in).useLocale(Locale.ENGLISH);

        int conta = 0;
        String agencia;
        String nomeCliente;
        double saldoConta = 0;

        
        System.out.print("Informe seu nome: ");
        nomeCliente = scanner.next();
        
        System.out.print("Informe o numero da conta: ");
        conta = scanner.nextInt();

        System.out.print("Informe Número da Agência: ");
        agencia = scanner.next();

        System.out.print("Informe seu saldo na conta: ");
        saldoConta = scanner.nextDouble();



        System.out.println("\nOlá "+ nomeCliente + ", Obrigado por criar uma conta em nosso banco.\n" +
        "| Conta:   | " +conta+" | \n"+ 
        "| Agência: | " +agencia+ " | \n"+ 
        "| Saldo:   | " +saldoConta+ " |\n"+
        "\nSeu Saldo já está disponível para saque.\n");      


    }
}
