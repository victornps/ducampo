package ducampo.dao;

import ducampo.model.Estado;
import ducampo.util.GenericDAO;


public class EstadoDAO extends GenericDAO<Estado>{
    
    @Override
    public Class<Estado> getClassType() {
        return Estado.class;
    }
}
