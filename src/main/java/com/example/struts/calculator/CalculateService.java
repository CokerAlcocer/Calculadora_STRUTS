package com.example.struts.calculator;

public class CalculateService {
    public boolean isNumeric(String str){
        try {
            double num = Double.parseDouble(str);
        }catch (Exception e) {
            System.out.println(e);
            return false;
        }

        return true;
    }
}
