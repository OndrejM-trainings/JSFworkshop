package omihalyi.jsf.rtl;

import javax.inject.Inject;

public abstract class BaseController {

    @Inject
    protected UserSessionContext appContext;

    public String getTextDirection() {
        return appContext.getTextDirection();
    }
    
    public void toggleTextDirection() {
        appContext.toggleLtr();
    }

}
