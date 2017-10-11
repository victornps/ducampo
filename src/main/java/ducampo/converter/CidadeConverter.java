package ducampo.converter;

import ducampo.dao.CidadeDAO;
import ducampo.model.Cidade;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "cidadeConverter", forClass = Cidade.class)
public class CidadeConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringCidade) {
        if (stringCidade != null) {
            int id = Integer.parseInt(stringCidade);
            CidadeDAO dao = new CidadeDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectCidade) {
        if (objectCidade != null) {
            Cidade cidade = (Cidade) objectCidade;
            return String.valueOf(cidade.getId());
        }
        return null;
    }
    
}
