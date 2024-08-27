public class Temp {

    public static void main(String[] args){
        double celsius = 31.7;
        double fahrenheit = (celsius * 1.8) + 32;

        String mensagem = String.format("A temperatura em celsius é %.2f e a temperatura em fahrenheit é %.2f", celsius, fahrenheit);
        System.out.println(mensagem);


        int temperaturaEmFahrenheitInteira = (int) fahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);
    }
}
