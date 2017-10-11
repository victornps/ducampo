package ducampo.converter;

import ducampo.dao.EstadoDAO;
import ducampo.model.Estado;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "estadoConverter", forClass = Estado.class)
public class EstadoConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringEstado) {
        if (stringEstado != null) {
            int id = Integer.parseInt(stringEstado);
            EstadoDAO dao = new EstadoDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectEstado) {
        if (objectEstado != null) {
            Estado estado = (Estado) objectEstado;
            return String.valueOf(estado.getId());
        }
        return null;
    }
    
}
