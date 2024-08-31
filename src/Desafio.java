import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        //Desafio 1
        Scanner leitura = new Scanner(System.in);

        int numero = 0;

        System.out.println("Digite um numero: ");
        numero = leitura.nextInt();

        if (numero > 0){
            System.out.println("Numero positivo");
        }
        else {
        System.out.println("Numero Negativo");
        }

        //Desafio 2

        /*Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int primeiro = leitura.nextInt();
        System.out.println("Digite o segundo numero: ");
        int segundo = leitura.nextInt();

        if (primeiro != segundo && primeiro > segundo){
            System.out.println("Os numeros são difentes e o " + primeiro + " é maior que o " + segundo);
        }else if (primeiro < segundo){
            System.out.println("Os numeros são difentes e o " + primeiro + " é menor que o " + segundo);
        } else {
            System.out.println("Os dois são iguais");
        }*/

        //Desafio 3

        /*Scanner leitura = new Scanner(System.in);

        double areaQuadrado = 0;
        double areaCirculo = 0;

        System.out.println("Escolha o que deseja fazer: Digite 1 para Calcular área do quadrado ou digite 2 para Calcular área do círculo: ");
        int escolha = leitura.nextInt();

        if (escolha == 1){
            System.out.println("Digite a medida de um dos lados");
            double lado = leitura.nextDouble();
            areaQuadrado = lado * lado;
            System.out.println("O tamanho da area do quadrado é: " + areaQuadrado);
        } else {
            System.out.println("Digite o raio do circulo");
            double raio = leitura.nextDouble();
            areaCirculo = (raio * raio) * 3.14;
            System.out.println("O tamanho da area do circulo é: " + areaCirculo);
        }*/

        //desafio 4

        /*Scanner leitura = new Scanner(System.in);

        int contador = 0;
        int resultado = 0;

        System.out.println("Digite um numero para ver a tabuada dele do 0 ate 10");
        int numero = leitura.nextInt();

        while (contador <=10) {
            resultado = numero * contador;
            System.out.println(numero + " X " + contador + " = " + resultado);
            contador++;
        }*/

        //desafio 5

        /*Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = leitura.nextInt();

        if (numero % 2 == 0){
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }*/

        //desafio 6

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int n = scanner.nextInt();

        long fatorial = 1;
        for(int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + n + " é: " + fatorial);*/

    }
}
