public class funcoesMatematicas {

    //cálculo de quantidade 'qtd' de termos da sequência fibonacci
    public void fibonacci(int qtd){
        int ult = 1, pen = 0, fibo = 0, cont = 1;
        while (cont <= qtd){
            pen = ult;
            ult = fibo;
            fibo = pen + ult;
            cont ++;
            System.out.println(fibo);
        }
    }
    //conversor de graus ºC para ºF
    public void coversorCelsiusToFahrenheit(int celsius){
        int tf = (int) ((celsius * 1.8) + 32);
        System.out.println(tf + " ºF");
    }
    //conversor de graus ºF para ºC
    public void coversorFahrenheitToCelsius(int fahrenheit){
        int tc = (int) ((fahrenheit - 32)/1.8);
        System.out.println(tc + " ºC");
    }
}
