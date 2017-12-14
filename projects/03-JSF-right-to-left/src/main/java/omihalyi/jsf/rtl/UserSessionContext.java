package omihalyi.jsf.rtl;

import java.io.Serializable;
import javax.enterprise.context.*;
import javax.inject.*;

@SessionScoped
@Named
public class UserSessionContext implements Serializable {
    
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
