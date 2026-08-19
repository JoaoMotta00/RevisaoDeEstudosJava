package basico.conversor;


public class Conversor {

    public static double converterCelsius(double c){
        return (c * 9/5) + 32;
    }

    public static double converterReal(double r){return r / 5.18;}

    public static double converterMetro(double m){return m * 3.281;}

    static void main(String[] args) {

        double celsius = 32;
        double fahrenheit = converterCelsius(celsius);
        System.out.println(celsius + " celsius são " + fahrenheit + " fahrenheit");

        double real = 50;
        double dolar = converterReal(real);
        System.out.println(real + " reais são " + dolar + " dólares");

        double metros = 9;
        double pes = converterMetro(metros);
        System.out.println(metros + " metros são " + pes + " pés");

    }

}




