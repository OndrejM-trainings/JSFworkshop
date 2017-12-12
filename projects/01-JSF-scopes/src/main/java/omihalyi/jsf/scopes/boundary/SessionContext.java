package omihalyi.jsf.scopes.boundary;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.context.*;

@SessionScoped
public class SessionContext implements Serializable {
    private Date created;

    @PostConstruct
    public void init() {
        created = new Date();
    }
    
    public Date getCreated() {
        return created;
    }
    
}
