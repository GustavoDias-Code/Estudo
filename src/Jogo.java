import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int tentativas = 0;
        int aleatorio = new Random().nextInt(100);
        int limite = 0;
        System.out.println(aleatorio);


        while (tentativas != aleatorio && limite < 5) {
            System.out.println("Jogo da advinhação: digite um numero de 0 a 100 para tentar acertar o numero da vez! ");
            tentativas = leitura.nextInt();
            limite++;

            if (tentativas < aleatorio) {
                System.out.println("Errou, vc chutou para baixo, tente um numero maior: ");
                tentativas = leitura.nextInt();

            } else if (tentativas > aleatorio) {
                System.out.println("Errou, vc chutou para cima, tente um numero menor: ");
                tentativas = leitura.nextInt();
            }

            if (tentativas == aleatorio) {
                System.out.println("Parabens vc acertou");
            }break;

        }
    }
}