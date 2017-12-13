package omihalyi.jsf.rtl;

import java.util.Locale;
import javax.enterprise.context.*;
import javax.faces.context.FacesContext;
import javax.inject.*;

@SessionScoped
@Named
public class ApplicationContext {
    
    @Inject
    private Translation

    private boolean ltr = false;

    public boolean isLtr() {
        return ltr;
    }

    public String getTextDirection() {
        return ltr ? "ltr" : "rtl";
    }

    void toggleLtr() {
        ltr = !ltr;
    }
    
    private Locale currentLocale = null;
    
    public Locale getCurrentLocale() {
        if (currentLocale == null) {
            currentLocale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
        }
    }

}
