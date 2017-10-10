package ducampo.dao;

import ducampo.model.Venda;
import ducampo.util.GenericDAO;

public class VendaDAO extends GenericDAO<Venda> {

    @Override
    public Class<Venda> getClassType() {
        return Venda.class;
    }
    
}
