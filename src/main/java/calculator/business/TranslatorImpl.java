package calculator.business;

import com.google.cloud.translate.Language;
import com.google.cloud.translate.Detection;
import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

import java.util.List;

public class TranslatorImpl implements Translator {

    private Translate translate;
    static final String key = "AIzaSyBJ01MsImGXDFSe2WdGMdTe-CvevbTUPoc";
    List<Language> languages;

    public TranslatorImpl () {
        translate = TranslateOptions.newBuilder().setApiKey(key).build().getService();
    }

    @Override
    public String translate(String from, String to, String text) {

        Translation translation = translate.translate(
                text,
                Translate.TranslateOption.sourceLanguage(from),
                Translate.TranslateOption.targetLanguage(to));
        return translation.getTranslatedText();
    }

    private String languageDetected(String text)
    {
        Detection detection = translate.detect(text);
        return detection.getLanguage();
    }

    public void showChoices()
    {
        List<Language> languages = translate.listSupportedLanguages();
        System.out.println("Choose 1 code of a language");
        for (Language language : languages) {
            System.out.printf("Name: %s, Code: %s\n", language.getName(), language.getCode());
        }
    }

    public String valid(String code)
    {
        boolean valid = true;

        while(valid)
        {
            this.showChoices();

            for (Language language : languages) {

                if ((language.getCode()).equals(code) ) {
                    valid = false;

                }
            }

        }
        return code;
    }

}
