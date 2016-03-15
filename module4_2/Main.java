package goit.homework.module4_2;

public class Main {
    public static void main(String[] args){
        Converter converter = new Converter(36.6f,451f);
        System.out.println("Celsius " + converter.getTemperatureC() + " is Fahrenheit " + converter.getTemperatureCtoF());
        System.out.println("Fahrenheit " + converter.getTemperatureF() + " is Celsius" + converter.getTemperatureFtoC());
            }
}
