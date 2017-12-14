package omihalyi.jsf.rtl;

import java.io.Serializable;
import java.util.Locale;
import javax.enterprise.context.*;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@SessionScoped
@Named
public class UserSessionContext implements Serializable {

    private boolean ltr = false;
    private Locale currentLocale = null;

    public boolean isLtr() {
        return ltr;
    }

    public String getTextDirection() {
        return ltr ? "ltr" : "rtl";
    }

    void toggleLtr() {
        ltr = !ltr;
    }

    public Locale getCurrentLocale() {
        if (currentLocale == null) {
            setCurrentLocale(FacesContext.getCurrentInstance().getViewRoot().getLocale());
        }
        return currentLocale;
    }

    public void setCurrentLocale(Locale currentLocale) {
        this.currentLocale = currentLocale;
        ltr = !isLanguageRtl(currentLocale);
    }

    private boolean isLanguageRtl(Locale currentLocale) {
        return "ar".equals(currentLocale.getLanguage());
    }

}
