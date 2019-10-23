package calculator.business;

import calculator.entities.Language;
//import com.google.cloud.translate.Translate;
import com.google.cloud.GcpLaunchStage;
import com.google.cloud.translate.Translate;
import com.google.cloud.translate.Translate.TranslateOption;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;


public interface Translator {

    public Translate translate = null;

    public static final String key = "AIzaSyBJ01MsImGXDFSe2WdGMdTe-CvevbTUPoc";


    public void Translator();


}
