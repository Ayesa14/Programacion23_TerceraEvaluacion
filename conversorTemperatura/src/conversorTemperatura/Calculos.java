package conversorTemperatura;

public class Calculos {

    public final static String FAHRENHEIT = "Celsius a Fahrenheit";
    public final static String CELSIUS = "Fahrenheit a Celsius";

    public static double calcularConversionTemperatura(Double temperatura,String tipoMedicion){

        switch(tipoMedicion){

            case FAHRENHEIT:
                return (temperatura * 9 / 5) + 32;
            case CELSIUS:
                return (temperatura - 32) * 5 / 9;
        }
        return 0;
    }

}
