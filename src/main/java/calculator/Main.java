package calculator;

import calculator.business.TranslatorImpl;

public class Main {
    public static void main(String args[]){
        TranslatorImpl t = new TranslatorImpl();
        System.out.println("Calculator");
        System.out.println(t.translate("EN", "ES", "Hello world"));
    }
}
