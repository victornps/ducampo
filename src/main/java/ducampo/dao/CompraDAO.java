package ducampo.dao;

import ducampo.model.Compra;
import ducampo.util.GenericDAO;


public class CompraDAO extends GenericDAO<Compra>{
    
    @Override
    public Class<Compra> getClassType() {
        return Compra.class;
    }
}
