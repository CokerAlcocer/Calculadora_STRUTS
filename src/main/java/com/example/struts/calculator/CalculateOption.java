package com.example.struts.calculator;

import com.opensymphony.xwork2.ActionSupport;

public class CalculateOption extends ActionSupport {
    private String num1, num2, operation;
    private double result;

    // --- Metodos de operación

    CalculateService cs = new CalculateService();

    @Override
    public void validate() {
        boolean flag1, flag2;
        flag1 = cs.isNumeric(num1);
        flag2 = cs.isNumeric(num2);
        if(flag1==false||num1==null||num1.equals("")){
            this.addFieldError("num1", "Solo se pueden ingresar números");
        }
        if(flag2==false||num2==null||num2.equals("")){
            this.addFieldError("num2", "Solo se pueden ingresar números");
        }
    }

    public String execute() {
        double num3, num4;
        try {
            num3 = Double.parseDouble(num1);
            num4 = Double.parseDouble(num2);
        }catch (Exception e) {
            this.addActionError("Solo se pueden ingresar números");
            e.printStackTrace();
            return "fail";
        }

        switch(operation){
            case "mas":
                result = num3 + num4;
                break;
            case "menos":
                result = num3 - num4;
                break;
            case "multi":
                result = num3 * num4;
                break;
            case "div":
                if(num4 == 0){
                    this.addFieldError("num2", "El divisor no puede ser 0");
                    return "fail";
                }else{
                    result = num3 / num4;
                }
                break;
            default:
                System.out.println("Opción no soportada");
        }

        return "success";
    }

    // --- Getters and Setters ---
    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
