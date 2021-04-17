package com.mc.termproject.unitconverter;

public class TimeConverter {



    public TimeConverter() {

    }


    public double convert(double fromVal, String from, String to) {
        double result = fromVal;
        switch (from)
        {
            case "SECOND":
                if (to.equals("SECOND")){
                    result = fromVal;

                }
                if (to.equals("MINUTE")){
                    result = fromVal/60;

                }
                if (to.equals("HOUR")) {
                    result = fromVal/3600;

                }
                if (to.equals("DAY")){
                    result = fromVal/86400;

                }
                if (to.equals("WEEK")){
                    result = fromVal/604800;

                }
                if (to.equals("MONTH")) {
                    result = fromVal/2628000;

                }
                if (to.equals("YEAR")) {
                    result = fromVal/31540000;

                }
                break;
            case "MINUTE":
                if (to.equals("SECOND")){
                    result = fromVal*60;

                }
                if (to.equals("MINUTE")){
                    result = fromVal;

                }
                if (to.equals("HOUR")) {
                    result = fromVal/60;

                }
                if (to.equals("DAY")){
                    result = fromVal/1440;

                }
                if (to.equals("WEEK")){
                    result = fromVal/10080;

                }
                if (to.equals("MONTH")) {
                    result = fromVal/43800;

                }
                if (to.equals("YEAR")) {
                    result = fromVal/525600;

                }
                break;
            case "HOUR":
                if (to.equals("SECOND")){
                    result = fromVal*3600;

                }
                if (to.equals("MINUTE")){
                    result = fromVal*60;

                }
                if (to.equals("HOUR")) {
                    result = fromVal;

                }
                if (to.equals("DAY")){
                    result = fromVal/24;

                }
                if (to.equals("WEEK")){
                    result = fromVal/168;

                }
                if (to.equals("MONTH")) {
                    result = fromVal/730;

                }
                if (to.equals("YEAR")) {
                    result = fromVal/8760;

                }
                break;
            case "DAY":
                if (to.equals("SECOND")){
                    result = fromVal*86400;

                }
                if (to.equals("MINUTE")){
                    result = fromVal*1440;

                }
                if (to.equals("HOUR")) {
                    result = fromVal*24;

                }
                if (to.equals("DAY")){
                    result = fromVal;

                }
                if (to.equals("WEEK")){
                    result = fromVal/7;

                }
                if (to.equals("MONTH")) {
                    result = fromVal/30;

                }
                if (to.equals("YEAR")) {
                    result = fromVal/365;

                }
                break;
            case "WEEK":
                if (to.equals("SECOND")){
                    result = fromVal*604800;

                }
                if (to.equals("MINUTE")){
                    result = fromVal*10080;

                }
                if (to.equals("HOUR")) {
                    result = fromVal*168;

                }
                if (to.equals("DAY")){
                    result = fromVal*7;

                }
                if (to.equals("WEEK")){
                    result = fromVal;

                }
                if (to.equals("MONTH")) {
                    result = fromVal/4;

                }
                if (to.equals("YEAR")) {
                    result = fromVal/52;

                }
                break;
            case "MONTH":
                if (to.equals("SECOND")){
                    result = fromVal*2628000;

                }
                if (to.equals("MINUTE")){
                    result = fromVal*43799;

                }
                if (to.equals("HOUR")) {
                    result = fromVal*730;

                }
                if (to.equals("DAY")){
                    result = fromVal*30;

                }
                if (to.equals("WEEK")){
                    result = fromVal*4;

                }
                if (to.equals("MONTH")) {
                    result = fromVal;

                }
                if (to.equals("YEAR")) {
                    result = fromVal/30;

                }
                break;
            case "YEAR":
                if (to.equals("SECOND")){
                    result = fromVal*31535965;

                }
                if (to.equals("MINUTE")){
                    result = fromVal*525599;

                }
                if (to.equals("HOUR")) {
                    result = fromVal*8759;

                }
                if (to.equals("DAY")){
                    result = fromVal*365;

                }
                if (to.equals("WEEK")){
                    result = fromVal*52;

                }
                if (to.equals("MONTH")) {
                    result = fromVal*30;

                }
                if (to.equals("YEAR")) {
                    result = fromVal/30;

                }
                break;
        }
        return result;
    }
}
