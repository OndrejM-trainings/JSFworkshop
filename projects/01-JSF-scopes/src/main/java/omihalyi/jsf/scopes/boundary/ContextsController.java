package omihalyi.jsf.scopes.boundary;

import javax.enterprise.context.*;
import javax.faces.context.FacesContext;
import javax.inject.*;
import javax.servlet.http.HttpServletRequest;

@Named
@ApplicationScoped
public class ContextsController {
    private ApplicationContext applicationContext;
    private SessionContext sessionContext;
    private ViewContext viewContext;
    private RequestContext requestContext;

    ContextsController() {
    }
    
    @Inject
    public ContextsController(ApplicationContext applicationContext, SessionContext sessionContext, ViewContext viewContext, RequestContext requestContext) {
        this.applicationContext = applicationContext;
        this.sessionContext = sessionContext;
        this.viewContext = viewContext;
        this.requestContext = requestContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public SessionContext getSessionContext() {
        return sessionContext;
    }

    public ViewContext getViewContext() {
        return viewContext;
    }

    public RequestContext getRequestContext() {
        return requestContext;
    }
    
    public void requestNewSession() {
        HttpServletRequest request = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
        request.getSession().invalidate();
    }
}
