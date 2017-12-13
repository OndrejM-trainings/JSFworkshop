package omihalyi.jsf.lang;

import java.util.*;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named("translate")
@Translation
@ApplicationScoped
public class TranslationResourceBundle extends ResourceBundle{

    @Override
    protected Object handleGetObject(String key) {
        final ResourceBundle fileBundle = ResourceBundle.getBundle("translation");
        
    }

    @Override
    public Enumeration<String> getKeys() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

}
