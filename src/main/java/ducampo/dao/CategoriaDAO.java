package ducampo.dao;

import ducampo.model.Categoria;
import ducampo.util.GenericDAO;

public class CategoriaDAO extends GenericDAO<Categoria> {

    @Override
    public Class<Categoria> getClassType() {
        return Categoria.class;
    }

}
