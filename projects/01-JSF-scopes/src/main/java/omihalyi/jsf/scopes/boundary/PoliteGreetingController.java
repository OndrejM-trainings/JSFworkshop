package omihalyi.jsf.scopes.boundary;

import javax.enterprise.context.RequestScoped;
import javax.inject.*;

@Named("politeController")
@RequestScoped
public class PoliteGreetingController {
    private GreetingController greetingController;

    PoliteGreetingController() {  // empty non-private constructor required for all CDI beans
    }
    
    @Inject
    public PoliteGreetingController(GreetingController greetingController) {
        this.greetingController = greetingController;
    }

    public String getGreeting() {
        return greetingController.getGreeting() + " I wish you a lovely day!";
    }
}
