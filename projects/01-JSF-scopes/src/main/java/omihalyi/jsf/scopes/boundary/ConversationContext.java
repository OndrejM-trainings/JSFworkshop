package omihalyi.jsf.scopes.boundary;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.enterprise.context.*;
import javax.inject.*;

@Named
@ConversationScoped
public class ConversationContext implements Serializable {
    private Date created;

    @Inject
    private Conversation conversation;
    
    @PostConstruct
    public void init() {
        if (conversation.isTransient()) {
            conversation.begin();
        }
        created = new Date();
    }
    
    public Date getCreated() {
        return created;
    }

}
