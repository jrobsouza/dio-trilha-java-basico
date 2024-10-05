
    import  java.util.Scanner;

    public class ContaTerminal {
       
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int numero;
            String nomeCLiente;
            String agencia;
            double saldo;
    
            System.out.println("***** Conta Bancária ****");
            System.out.println();
    
            System.out.println("Digite sua Conta:");
            numero = scn.nextInt();
    
            System.out.println("Digite sua Agência: ");
            agencia = scn.next();
    
            System.out.println(" Digite seu Nome: ");
            nomeCLiente = scn.next();
    
            System.out.println(" Digite seu saldo:");
            saldo = scn.nextDouble();
    
            System.out.println();
         System.out.printf(" Olá " + nomeCLiente + "  obrigado por criar uma conta bancaria conosco, " +
            "sua Agência é : " + agencia + " , sua conta é : " + numero + 
            " , seu saldo ja esta disponivel:  " + saldo );
    
            scn.close();
        }
    
    }
    

