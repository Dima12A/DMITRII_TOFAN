package org.example.homework_nr_3;

public class TemperatureConverter {

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        double celsiustemp = 22.0;
        double fahrenheittemp = 0.0;

        double fahrenheit = converter.toFahrenheit(celsiustemp);
        System.out.println(celsiustemp + " градуса Цельсия = " + fahrenheit + " градуса Фаренгейта");

        double celsius = converter.toCelsius(fahrenheittemp);
        System.out.println(fahrenheittemp + " градуса Фаренгейта = " + celsius + " градуса Цельсия");

    }
        public double toCelsius (double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }
        public double toFahrenheit (double celsius) {
            return celsius * 9 / 5 + 32;

        }
}

