package omihalyi.jsf.rtl;

import java.util.ResourceBundle;
import javax.enterprise.context.RequestScoped;
import javax.inject.*;
import omihalyi.jsf.lang.*;

@Named
@RequestScoped
public class IndexPageController extends BaseController {
    @Inject
    @Translation
    private ResourceBundle translate;
    
}
