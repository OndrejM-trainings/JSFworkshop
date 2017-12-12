package omihalyi.jsf.scopes.boundary;

import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class RequestContext {
    private Date created;

    @PostConstruct
    public void init() {
        created = new Date();
    }
    
    public Date getCreated() {
        return created;
    }
    
}
