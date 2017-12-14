package omihalyi.jsf.lang;

import java.util.Locale;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Named;

@Named
@RequestScoped
public class LocaleToIsoConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        return Locale.forLanguageTag(string);
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        Locale locale = Locale.class.cast(o);
        return locale.toLanguageTag();
    }

}
