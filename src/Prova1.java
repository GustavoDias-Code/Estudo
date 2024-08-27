public class Prova1 {

    public static void main(String[] args){
        //1
       double nota1 = 7.3;
       double nota2 = 5.7;
       double media = (nota1 + nota2) /2;

        System.out.println("A media é: " + media);

        //2
        int mediaInteira = (int) media;
        System.out.println ("A media é: " + mediaInteira);

        //3
        char nota = 'a';
        String mensagem = String.format("A nota do aluno é:  %c +",nota);
        System.out.println(mensagem);

        //4
        double precoProduto = 22.49;
        int qtd = 5;
        int total = (int) (precoProduto * qtd);
        String resultado = String.format("O resultado da multiplicação é %d ", total);
        System.out.println(resultado);

        //5
        double valorEmDolares = 55.70;
        double dolar = 4.94;

        double reais = valorEmDolares * dolar;
        System.out.println("O valor em reais é: " + reais);

        //6
        double precoOriginal = 100;
        double percentualDesconto = 15;
        double desconto = (precoOriginal * percentualDesconto) / 100;

        System.out.println("O valor em reais é: " + desconto);

















































































































































































































    }






































































}
