package calculator.business;

import calculator.entities.Language;
import com.google.cloud.translate.Translate;
import com.google.cloud.translate.Translate.TranslateOption;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;
public interface Translator {

    public String translate(String from, String to, String text);
}
