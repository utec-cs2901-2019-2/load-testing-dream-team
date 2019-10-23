package calculator.business;

import com.google.cloud.translate.*;

import java.util.List;

public class TranslatorImpl  {
    public Translate translate = null;

    public static final String key = "AIzaSyBJ01MsImGXDFSe2WdGMdTe-CvevbTUPoc";

    public TranslatorImpl(){
        translate = TranslateOptions.newBuilder().setApiKey(key).build().getService();
    }
    private String languageDetected(String text)
    {
        Detection detection = translate.detect(text);
        return detection.getLanguage();
    }

    public void showChoices()
    {
        List<com.google.cloud.translate.Language> languages = translate.listSupportedLanguages();
        System.out.println("Choose 1 code of a language");
        for (Language language : languages) {
            System.out.printf("Name: %s, Code: %s\n", language.getName(), language.getCode());
        }
    }

    public void printTranslation(String inputText, String lang)
    {
        String origin = languageDetected(inputText);

        Translation translation = translate.translate(
                inputText,
                Translate.TranslateOption.sourceLanguage(origin),
                Translate.TranslateOption.targetLanguage(lang));
        System.out.println(translation.getTranslatedText());
    }
//    public String valid(String code)
//    {
//        boolean valid = true;
//
//        while(valid)
//        {
//            code.showChoices();
//            String code = in.nextLine();
//
//            for (Language language : languages) {
//
//                if ((language.getCode()).equals(code) ) {
//                    valid=False;
//
//                }
//            }
//
//        }
//        return code;
//    }


}
