package omihalyi.jsf.rtl;

import javax.inject.Inject;

public abstract class BaseController {

    @Inject
    protected UserSessionContext sessionContext;

    public String getTextDirection() {
        return sessionContext.getTextDirection();
    }
    
    public void toggleTextDirection() {
        sessionContext.toggleLtr();
    }

}
