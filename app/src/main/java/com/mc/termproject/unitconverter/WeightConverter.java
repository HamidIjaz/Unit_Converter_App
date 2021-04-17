package com.mc.termproject.unitconverter;

public class WeightConverter {

    public WeightConverter() {

    }


    public double convert(double fromVal, String from, String to) {
        double result = fromVal;
        switch (from) {
            case "KILOGRAM":
                if (to.equals("KILOGRAM")) {
                    result = fromVal;

                }
                if (to.equals("GRAM")) {
                    result = fromVal * 1000;

                }
                if (to.equals("POUND")) {
                    result = fromVal * 2.2;

                }
                if (to.equals("OUNCE")) {
                    result = fromVal * 35.2;

                }
                if (to.equals("TON")) {
                    result = fromVal / 1000;

                }
                break;
            case "GRAM":
                if (to.equals("KILOGRAM")) {
                    result = fromVal / 1000;

                }
                if (to.equals("GRAM")) {
                    result = fromVal;

                }
                if (to.equals("POUND")) {
                    result = fromVal / 454;

                }
                if (to.equals("OUNCE")) {
                    result = fromVal / 28;

                }
                if (to.equals("TON")) {
                    result = fromVal / 907185;

                }
                break;
            case "POUND":
                if (to.equals("KILOGRAM")) {
                    result = fromVal / 2.2;

                }
                if (to.equals("GRAM")) {
                    result = fromVal*454;

                }
                if (to.equals("POUND")) {
                    result = fromVal;

                }
                if (to.equals("OUNCE")) {
                    result = fromVal*16;

                }
                if (to.equals("TON")) {
                    result = fromVal / 2205;

                }
                break;
            case "OUNCE":
                if (to.equals("KILOGRAM")) {
                    result = fromVal / 35;

                }
                if (to.equals("GRAM")) {
                    result = fromVal*28;

                }
                if (to.equals("POUND")) {
                    result = fromVal / 16;

                }
                if (to.equals("OUNCE")) {
                    result = fromVal;

                }
                if (to.equals("TON")) {
                    result = fromVal / 35274;

                }
                break;
            case "TON":
                if (to.equals("KILOGRAM")) {
                    result = fromVal * 1000;

                }
                if (to.equals("GRAM")) {
                    result = fromVal*1000000;

                }
                if (to.equals("POUND")) {
                    result = fromVal *2205;

                }
                if (to.equals("OUNCE")) {
                    result = fromVal*35274;

                }
                if (to.equals("TON")) {
                    result = fromVal;

                }
                break;
        }
        return result;
    }
}

