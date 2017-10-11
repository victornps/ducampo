package ducampo.converter;

import ducampo.dao.FornecedorDAO;
import ducampo.model.Fornecedor;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "fornecedorConverter", forClass = Fornecedor.class)
public class FornecedorConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringFornecedor) {
        if (stringFornecedor != null) {
            int id = Integer.parseInt(stringFornecedor);
            FornecedorDAO dao = new FornecedorDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectFornecedor) {
        if (objectFornecedor != null) {
            Fornecedor fornecedor = (Fornecedor) objectFornecedor;
            return String.valueOf(fornecedor.getId());
        }
        return null;
    }
    
}
