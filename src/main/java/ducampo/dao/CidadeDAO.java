package ducampo.dao;

import ducampo.model.Cidade;
import ducampo.util.GenericDAO;


public class CidadeDAO extends GenericDAO<Cidade>{
    
    @Override
    public Class<Cidade> getClassType() {
        return Cidade.class;
    }
}
