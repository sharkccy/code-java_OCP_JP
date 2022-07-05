package javaapplication1;

import java.util.Locale;

public class JavaApplication1 {
    public static void main(String[] args) {
        Locale tw = new Locale("zh", "TW");
        System.out.println(tw.getDisplayCountry());
        System.out.println(tw.getDisplayLanguage());
        
        Locale de = new Locale("de", "DE");
        System.out.println(de.getDisplayCountry());
        System.out.println(de.getDisplayLanguage());
        
    }

}
