package calculator;


import calculator.business.TranslatorImpl;
import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        TranslatorImpl trans = new TranslatorImpl();
        System.out.println("Write the text :");
        String text =  in.nextLine();

        trans.printTranslation(text,"es");

        //trans.showChoices();
        //String code = in.nextLine();
//        String code = "";
//        code = trans.valid(code);
//        trans.printTranslation(text, code);


    }
}
