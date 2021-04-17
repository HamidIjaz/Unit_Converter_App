package com.mc.termproject.unitconverter;

public class TempConverter {



    public TempConverter() {

    }


    public double convert(double fromVal, String from, String to) {
        double result = fromVal;
        switch (from)
        {
            case "Celsius":
                if (to.equals("Kelvin")){
                    result = fromVal + 273.15;

                }
                if (to.equals("Fahrenheit")){
                    result = (fromVal* 9/5) + 32 ;

                }
                if (to.equals("Celsius")) {
                    result = fromVal;

                }
                break;
            case "Kelvin":
                if (to.equals("Celsius")) {
                    result = fromVal-273.15;

                }
                if (to.equals("Fahrenheit")) {
                    result = (fromVal-273.15) * 9/5 + 3 ;

                }
                if (to.equals("Kelvin")) {
                    result = fromVal;

                }
                break;
            case "Fahrenheit":
                if (to.equals("Celsius")) {
                    result = (32*fromVal - 32) * 5/9 ;

                }
                if (to.equals("Fahrenheit")) {
                    result = fromVal;

                }
                if (to.equals("Kelvin")) {
                    result =(32*fromVal - 32) * 5/9 + 273.15;

                }
                break;
        }
        return result;
    }
}
