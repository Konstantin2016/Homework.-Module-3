package goit.homework.module4_2;

public class Main {
    public static void main(String[] args){
        Converter converter = new Converter(36.6f,451f);
        System.out.println("Celsius " + converter.temperatureC + " is Fahrenheit " + converter.getTemperatureCtoF());
        System.out.println("Fahrenheit " + converter.temperatureF + " is Celsius" + converter.getTemperatureFtoC());
            }
}
