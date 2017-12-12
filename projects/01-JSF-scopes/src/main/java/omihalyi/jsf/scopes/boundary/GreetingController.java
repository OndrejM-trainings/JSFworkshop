package omihalyi.jsf.scopes.boundary;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class GreetingController {
    public String getGreeting() {
       return "Hello, world!";
   }
}
