package ducampo.dao;

import ducampo.model.Bairro;
import ducampo.util.GenericDAO;


public class BairroDAO extends GenericDAO<Bairro>{
    
    @Override
    public Class<Bairro> getClassType() {
        return Bairro.class;
    }
}
