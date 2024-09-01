import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Gustavo Dias";
        String tipoConta = "Corrente";
        double saldo = 4500.00;
        int option; //testar com 0


        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente: \n");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo Inicial: " + saldo);
        System.out.println("***********************\n");

        do {

        System.out.println("Operações\n");
        System.out.println("1- Consultar saldos");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Sair\n");
        System.out.println("Digite a opção desejada: ");
        option = leitura.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Seu saldo é R$: " + saldo + "\n");
                    break;
                case 2:
                    System.out.print("Informe o valor a receber: \n");
                    saldo += leitura.nextDouble();
                    System.out.println("Saldo atualizado R$: " + saldo + "\n");
                    break;
                case 3:
                    System.out.print("Informe o valor da transferência: \n");
                    double tranferencia = leitura.nextDouble();
                    if (tranferencia <= saldo){
                        System.out.println("Saldo atualizado R$: " + (saldo - tranferencia));
                    }else {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.\n");
                    }break;
                case 4:
                    System.out.println("Sessão Encerrada!\n");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }


        } while (option != 4);

    }
}
