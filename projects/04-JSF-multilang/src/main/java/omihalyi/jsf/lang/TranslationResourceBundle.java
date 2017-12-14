package omihalyi.jsf.lang;

import java.util.*;
import javax.enterprise.context.*;
import javax.faces.application.Application;
import javax.faces.context.FacesContext;
import javax.inject.*;
import omihalyi.jsf.rtl.UserSessionContext;

@Named("translate")
@Translation
@Dependent
public class TranslationResourceBundle extends ResourceBundle {

    @Inject
    private UserSessionContext sessionContext;

    protected Object handleGetObject(String key) {
        Object translation = translateByCustomMechanism(key, sessionContext.getCurrentLocale());
        if (translation != null) {
            return translation;
        } else {
            final ResourceBundle jsfBundle = getJsfBundle("translateStatic");
            // fall back to translateStatic resource bundle which is defined in faces-config.xml
            if (jsfBundle.containsKey(key)) {
                return jsfBundle.getObject(key);
            } else {
                // fall back to english language if not found in current language
                ResourceBundle defaultBundle = ResourceBundle.getBundle(jsfBundle.getBaseBundleName(), Locale.ENGLISH);
                return defaultBundle.getObject(key);
            }
        }
    }

    // returns the JSF resource bundle defined as variable bundleName
    private static ResourceBundle getJsfBundle(String bundleName) {
        FacesContext context = FacesContext.getCurrentInstance();
        Application app = context.getApplication();
        ResourceBundle jsfBundle = app.getResourceBundle(context, bundleName);
        return jsfBundle;
    }

    @Override
    public Enumeration<String> getKeys() {
        throw new UnsupportedOperationException("Implement this method only if really needed");
    }

    private Object translateByCustomMechanism(String key, Locale currentLocale) {
        return null; // To be implemented
    }

}
