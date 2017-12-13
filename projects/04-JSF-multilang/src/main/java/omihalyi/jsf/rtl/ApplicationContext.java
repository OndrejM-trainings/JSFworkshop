package omihalyi.jsf.rtl;

import javax.enterprise.context.*;
import javax.inject.Named;

@SessionScoped
@Named
public class ApplicationContext {

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

}
