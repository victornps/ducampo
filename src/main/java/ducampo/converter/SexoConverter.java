package ducampo.converter;

import ducampo.dao.SexoDAO;
import ducampo.model.Sexo;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "sexoConverter", forClass = Sexo.class)
public class SexoConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringSexo) {
        if (stringSexo != null) {
            int id = Integer.parseInt(stringSexo);
            SexoDAO dao = new SexoDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectSexo) {
        if (objectSexo != null) {
            Sexo sexo = (Sexo) objectSexo;
            return String.valueOf(sexo.getId());
        }
        return null;
    }
    
}
