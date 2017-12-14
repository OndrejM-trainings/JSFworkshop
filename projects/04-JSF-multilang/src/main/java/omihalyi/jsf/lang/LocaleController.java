package omihalyi.jsf.lang;

import java.util.*;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import omihalyi.jsf.rtl.BaseController;

@Named
@RequestScoped
public class LocaleController extends BaseController {
    public List<Locale> getSupportedLocales() {
        List<Locale> result = new ArrayList<>();
        FacesContext.getCurrentInstance().getApplication().getSupportedLocales()
                .forEachRemaining(result::add);
        return result;
    }
}
