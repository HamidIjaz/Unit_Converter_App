package com.mc.termproject.unitconverter;

public class AreaConverter {

    public AreaConverter()
    {

    }
    public double convert(double fromVal, String from, String to) {
        double result = fromVal;
        switch (from) {
            case "SQUARE METER":
                if (to.equals("SQUARE METER")) {
                    result = fromVal;

                }
                if (to.equals("SQUARE KILOMETER")) {
                    result = fromVal / 1000;

                }
                if (to.equals("SQUARE MILE")) {
                    result = fromVal / 3.861e-7;

                }
                if (to.equals("SQUARE YARD")) {
                    result = fromVal * 1.1;

                }
                if (to.equals("SQUARE FOOT")) {
                    result = fromVal *10.7;

                }
                if (to.equals("ACRE")) {
                    result = fromVal / 4047;

                }
                break;
            case "SQUARE KILOMETER":
                if (to.equals("SQUARE METER")) {
                    result = fromVal*10760000;

                }
                if (to.equals("SQUARE KILOMETER")) {
                    result = fromVal;

                }
                if (to.equals("SQUARE MILE")) {
                    result = fromVal / 2.59;

                }
                if (to.equals("SQUARE FOOT")) {
                    result = fromVal *10760000;

                }
                if (to.equals("SQUARE YARD")) {
                    result = fromVal * 1196000;

                }
                if (to.equals("ACRE")) {
                    result = fromVal * 247;

                }
                break;
            case "SQUARE MILE":
                if (to.equals("SQUARE METER")) {
                    result = fromVal*2590000;

                }
                if (to.equals("SQUARE KILOMETER")) {
                    result = fromVal*2.59;

                }
                if (to.equals("SQUARE MILE")) {
                    result = fromVal;

                }
                if (to.equals("SQUARE FOOT")) {
                    result = fromVal * 27880000;
                }

                if (to.equals("SQUARE YARD")) {
                    result = fromVal * 3098000;

                }
                if (to.equals("ACRE")) {
                    result = fromVal * 640;

                }
                break;
            case "SQUARE YARD":
                if (to.equals("SQUARE METER")) {
                    result = fromVal/1.1;

                }
                if (to.equals("SQUARE KILOMETER")) {
                    result = fromVal/1196000;

                }
                if (to.equals("SQUARE MILE")) {
                    result = fromVal / 3.2283e-7;

                }
                if (to.equals("SQUARE FOOT")) {
                    result = fromVal *9;

                }
                if (to.equals("SQUARE YARD")) {
                    result = fromVal;

                }
                if (to.equals("ACRE")) {
                    result = fromVal / 4840;

                }
                break;
            case "SQUARE FOOT":
                if (to.equals("SQUARE METER")) {
                    result = fromVal/10.76;

                }
                if (to.equals("SQUARE KILOMETER")) {
                    result = fromVal/1.076e+7;

                }
                if (to.equals("SQUARE MILE")) {
                    result = fromVal / 2.788e+7;

                }
                if (to.equals("SQUARE FOOT")) {
                    result = fromVal;

                }
                if (to.equals("SQUARE YARD")) {
                    result = fromVal/9;

                }
                if (to.equals("ACRE")) {
                    result = fromVal/43560;

                }
                break;
            case "ACRE":
                if (to.equals("SQUARE METER")) {
                    result = fromVal*4047;

                }
                if (to.equals("SQUARE KILOMETER")) {
                    result = fromVal/247;

                }
                if (to.equals("SQUARE MILE")) {
                    result = fromVal / 640;

                }
                if (to.equals("SQUARE FOOT")) {
                    result = fromVal *43560;

                }
                if (to.equals("SQUARE YARD")) {
                    result = fromVal * 4840;

                }
                if (to.equals("ACRE")) {
                    result = fromVal;

                }
                break;
        }
        return result;
    }
}
