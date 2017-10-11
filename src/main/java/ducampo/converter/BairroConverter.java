package ducampo.converter;

import ducampo.dao.BairroDAO;
import ducampo.model.Bairro;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "bairroConverter", forClass = Bairro.class)
public class BairroConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringBairro) {
        if (stringBairro != null) {
            int id = Integer.parseInt(stringBairro);
            BairroDAO dao = new BairroDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectBairro) {
        if (objectBairro != null) {
            Bairro bairro = (Bairro) objectBairro;
            return String.valueOf(bairro.getId());
        }
        return null;
    }
    
}
